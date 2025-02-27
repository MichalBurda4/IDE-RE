package parser;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

public class Main{
    public static void main(String[] args) throws Exception {

        ArrayList<ScenarioFile> files = new ArrayList<>();
        ScenarioFile scenario1File = new ScenarioFile(
                "src/main/scenarios/scenario1.txt",
                "src/main/output/code/scenario1Java.txt",
                "src/main/output/code/scenario1Python.txt",
                "src/main/output/code/scenario1CS.txt",
                "src/main/output/code/scenario1CPP.txt"
                );
        ScenarioFile scenario2File = new ScenarioFile(
                "src/main/scenarios/scenario2.txt",
                "src/main/output/code/scenario2Java.txt",
                "src/main/output/code/scenario2Python.txt",
                "src/main/output/code/scenario2CS.txt",
                "src/main/output/code/scenario2CPP.txt"
        );
        ScenarioFile scenario3File = new ScenarioFile(
                "src/main/scenarios/scenario3.txt",
                "src/main/output/code/scenario3Java.txt",
                "src/main/output/code/scenario3Python.txt",
                "src/main/output/code/scenario3CS.txt",
                "src/main/output/code/scenario3CPP.txt"
        );
        ScenarioFile scenario4File = new ScenarioFile(
                "src/main/scenarios/scenario4.txt",
                "src/main/output/code/scenario4Java.txt",
                "src/main/output/code/scenario4Python.txt",
                "src/main/output/code/scenario4CS.txt",
                "src/main/output/code/scenario4CPP.txt"
        );
        files.add(scenario1File);
        files.add(scenario2File);
        files.add(scenario3File);
        files.add(scenario4File);

        for(var file : files){
            InputStream is = new FileInputStream(file.inputFileName);
            ANTLRInputStream input = new ANTLRInputStream(is);

            ucTokens lexer = new ucTokens(input);

            CommonTokenStream tokens = new CommonTokenStream(lexer);

            ucGrammar parser = new ucGrammar(tokens);

            ParseTree tree = parser.program();

            ucGrammarBaseListener listener = new ucGrammarBaseListener();

            ParseTreeWalker.DEFAULT.walk(listener, tree);

            String javaCode = listener.getJavaCode();
            String csCode = listener.getCsCode();
            String cppCode = listener.getCppCode();
            String pythonCode = listener.getPythonCode();

            try {
                Files.write(Paths.get(file.javaOutput), javaCode.getBytes());
                Files.write(Paths.get(file.CSOutput), csCode.getBytes());
                Files.write(Paths.get(file.CPPOutput), cppCode.getBytes());
                Files.write(Paths.get(file.pythonOutput), pythonCode.getBytes());

                System.out.println("Zapisano do pliku: " + file.javaOutput );
                System.out.println("Zapisano do pliku: " + file.CSOutput );
                System.out.println("Zapisano do pliku: " + file.CPPOutput );
                System.out.println("Zapisano do pliku: " + file.pythonOutput );
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
