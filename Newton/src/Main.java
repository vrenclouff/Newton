import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.ParserRuleContext;

import java.io.IOException;
import java.util.Iterator;

public class Main {
    private static final String INPUT = "testSimpleInput.txt";

//    private static final String INPUT = "testInput.txt";


    public static void main(String[]args) {
        try {
            NewtonLexer lexer = new NewtonLexer(CharStreams.fromFileName(INPUT));
            CommonTokenStream tokens = new CommonTokenStream(lexer);

            NewtonParser parser = new NewtonParser(tokens);
            ParserRuleContext ruleContext = parser.program();

            MainVisitor visitor = new MainVisitor();
            visitor.visit(ruleContext);

            printInstructions(visitor);

        } catch (IOException e) {
           System.out.println(e.getMessage());
        } catch (GrammarException e) {
            System.out.println(e.getMessage());
        } catch (NullPointerException e){}
    }

    private static void printInstructions(MainVisitor visitor) {
        Iterator instructions = visitor.getInstructions().iterator();
        int line = 0;
        System.out.println("----- INSTRUCTIONS ------");
        while(instructions.hasNext()) {
            System.out.println((line++) + "\t" + instructions.next());
        }
    }
}
