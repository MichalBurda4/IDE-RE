package org.example;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DiagramGenerator {
    public void generateDiagram() {
        System.setProperty("GRAPHVIZ_DOT", "C:\\Program Files (x86)\\Graphviz\\bin\\dot.exe");
        String inputDir = "src/main/scenarios";
        String outputDir = "src/main/output/diagrams";

        try {
            Files.createDirectories(Paths.get(outputDir));

            Files.list(Paths.get(inputDir)).forEach(file -> {
                try {
                    List<String> lines = Files.readAllLines(file);
                    String diagramTitle = extractTitle(lines);
                    List<String> mainSteps = extractSteps(lines, "Glowny Przeplyw:");
                    Map<Integer, List<String>> alternativeFlows = extractAlternativeSteps(lines);

                    String outputFilePath = outputDir + "/" + file.getFileName().toString().replace(".txt", ".puml");
                    generatePlantUMLFile(diagramTitle, mainSteps, alternativeFlows, outputFilePath);

                } catch (IOException e) {
                    e.printStackTrace();
                }
            });

            // Generowanie obrazów PNG dla wszystkich plików .puml w folderze diagrams
            Files.list(Paths.get(outputDir))
                    .filter(path -> path.toString().endsWith(".puml"))
                    .forEach(path -> generateImageFromPlantUML(path.toString(), "png"));

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    // Pobranie tytułu przypadku użycia
    private static String extractTitle(List<String> lines) {
        for (String line : lines) {
            if (line.startsWith("UC ")) {
                return line.split(" ", 3)[2].trim();
            }
        }
        return "UnknownProcess";
    }

    // Pobranie kroków głównego przepływu
    private static List<String> extractSteps(List<String> lines, String sectionHeader) {
        List<String> steps = new ArrayList<>();
        boolean isInSection = false;
        Pattern pattern = Pattern.compile("<aktywnosc>(.*?)</a>.*?<parametr>(.*?)</p>");

        for (String line : lines) {
            if (line.contains(sectionHeader)) {
                isInSection = true;
                continue;
            }
            if (isInSection && (line.contains("Alternatywny Przeplyw:") || line.contains("Wyjatki:"))) {
                break;
            }
            Matcher matcher = pattern.matcher(line);
            if (matcher.find()) {
                steps.add(matcher.group(1).trim() + " " + matcher.group(2).trim());
            }
        }
        return steps;
    }

    // Pobranie kroków alternatywnego przepływu i mapowanie ich do numeru głównego kroku
    private static Map<Integer, List<String>> extractAlternativeSteps(List<String> lines) {
        Map<Integer, List<String>> alternatives = new HashMap<>();
        boolean isAlternativeFlow = false;
        Pattern pattern = Pattern.compile("^(\\d+)\\.\\d+\\.\\s*.*?<aktywnosc>(.*?)</a>.*?<parametr>(.*?)</p>");

        for (String line : lines) {
            if (line.contains("Alternatywny Przeplyw:")) {
                isAlternativeFlow = true;
                continue;
            }
            if (isAlternativeFlow) {
                Matcher matcher = pattern.matcher(line);
                if (matcher.find()) {
                    int mainStepNumber = Integer.parseInt(matcher.group(1));
                    String alternativeAction = matcher.group(2).trim() + " " + matcher.group(3).trim();
                    alternatives.computeIfAbsent(mainStepNumber, k -> new ArrayList<>()).add(alternativeAction);
                }
            }
        }
        return alternatives;
    }

    // Generowanie pliku UML uwzględniającego przepływy alternatywne
    private static void generatePlantUMLFile(String title, List<String> steps, Map<Integer, List<String>> alternatives, String outputFilePath) throws IOException {
        FileWriter writer = new FileWriter(outputFilePath);
        writer.write("@startuml\n");
        writer.write("[*] --> S2 : \"" + title + "\" \n");

        String previousState = "S1";
        int stepCount = 1;
        String lastStepState = ""; // Przechowywanie ostatniego kroku głównego przepływu

        for (int i = 0; i < steps.size(); i++) {
            String stepState = "S" + (++stepCount);
            writer.write("state \"" + steps.get(i) + "\" as " + stepState + "\n");

            if (alternatives.containsKey(i + 1)) {
                // Tworzenie decyzji dla alternatywnego przepływu
                String decisionState = "D" + stepCount;
                writer.write("state \"Decyzja\" as " + decisionState + "\n");

                writer.write(previousState + " --> " + decisionState + " : Decyzja\n");
                String tmpState = null;

                for (String altStep : alternatives.get(i + 1)) {
                    if (tmpState == null) {
                        tmpState = decisionState;
                    }

                    // Sprawdzenie, czy przeniesienie do strony głównej
                    if (altStep.toLowerCase().contains("strony startowej")) {
                        writer.write(tmpState + " --> [*] : Powrót do strony startowej\n");
                        break;
                    }

                    String altState = "A" + (++stepCount);
                    writer.write("state \"" + altStep + "\" as " + altState + "\n");



                    writer.write(tmpState + " --> " + altState + " : Alternatywny przepływ\n");
                    tmpState = altState;

                    // Sprawdzenie przeniesienia do konkretnego punktu w głównym przepływie
                    if (Character.isDigit(altStep.charAt(altStep.length() - 1))) {
                        int targetPoint = Character.getNumericValue(altStep.charAt(altStep.length() - 1));
                        targetPoint++;
                        writer.write(tmpState + " --> " + "S" + targetPoint + "\n");
                    }

                }

                writer.write(decisionState + " --> " + stepState + " : Główny przepływ\n");
                previousState = stepState;
            } else {
                if (previousState.equals("S1")) {
                    previousState = stepState;
                    continue;
                }
                writer.write(previousState + " --> " + stepState + "\n");
                previousState = stepState;
            }

            // Przechowujemy ostatni stan głównego przepływu
            lastStepState = stepState;
        }

        // Dodanie połączenia do końcowej kropki
        if (!lastStepState.isEmpty()) {
            writer.write(lastStepState + " --> [*] : Koniec\n");
        }

        writer.write("@enduml\n");
        writer.close();
    }


    private static void generateImageFromPlantUML(String umlFilePath, String outputFormat) {
        try {
            String plantUMLPath = "src/main/resources/plantuml-lgpl-1.2025.0.jar";
            ProcessBuilder processBuilder = new ProcessBuilder(
                    "java", "-jar", plantUMLPath, "-graphvizdot", "C:\\Program Files (x86)\\Graphviz\\bin\\dot.exe",
                    "-t" + outputFormat, umlFilePath
            );

            processBuilder.inheritIO();
            Process process = processBuilder.start();
            process.waitFor();

            System.out.println("Diagram zapisany jako " + outputFormat.toUpperCase());
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }
}
