package parser;

public class ScenarioFile {
    public String inputFileName;
    public String javaOutput;
    public String pythonOutput;
    public String CSOutput;
    public String CPPOutput;

    public ScenarioFile(String inputFileName, String javaOutput, String pythonOutput, String CSOutput, String CPPOutput) {
        this.inputFileName = inputFileName;
        this.javaOutput = javaOutput;
        this.pythonOutput = pythonOutput;
        this.CSOutput = CSOutput;
        this.CPPOutput = CPPOutput;
    }

}
