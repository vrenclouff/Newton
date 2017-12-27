import com.beust.jcommander.JCommander;
import com.beust.jcommander.Parameter;
import com.beust.jcommander.ParameterException;
import org.antlr.v4.runtime.BailErrorStrategy;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.ParserRuleContext;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Iterator;

public class Main {

    private static final String FILE_FORMAT = "n";

    @Parameter(required = true, description = "Source file")
    private String inputFile;

    @Parameter(names = {"--output", "-o"})
    private String outputFile = "a.out";

    public static void main(String... argv) {
        Main main = new Main();
        try {
            JCommander.newBuilder().addObject(main).build().parse(argv);
            main.run();
        } catch (ParameterException e) {
            System.out.println(e.getMessage());
        }
    }

    public void run() {
        try {
            validInputFile();
            NewtonLexer lexer = new NewtonLexer(CharStreams.fromFileName(inputFile));
            CommonTokenStream tokens = new CommonTokenStream(lexer);

            NewtonParser parser = new NewtonParser(tokens);
            parser.setErrorHandler(new BailErrorStrategy());

            ParserRuleContext ruleContext = parser.program();

            MainVisitor visitor = new MainVisitor();
            visitor.visit(ruleContext);

            printInstructions(visitor);

        } catch (IOException e) {
            System.out.println(e.getMessage());
        } catch (GrammarException e) {
            System.out.println(e.getMessage());
        }
    }

    private void validInputFile() throws IOException {
        String[] fileComponents = inputFile.split("\\.");
        String fileFormat = fileComponents[fileComponents.length -1];
        if (!fileFormat.equals(FILE_FORMAT)) {
            throw new IOException("Supported only '."+FILE_FORMAT+"' files.");
        }
    }

    private void printInstructions(MainVisitor visitor) {
        Iterator instructions = visitor.getInstructions().iterator();
        int line = 0;
        try {
            FileWriter writer = new FileWriter(outputFile);
            while (instructions.hasNext()) {
                writer.write((line++) + "\t" + instructions.next() + "\n");
            }
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
