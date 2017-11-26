import org.antlr.v4.gui.Trees;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.ParserRuleContext;

import java.io.IOException;

public class Main {
    private static final String INPUT = "testSimpleInput.txt";

//    private static final String INPUT = "testInput.txt";


    public static void main(String[]args) {
        try {
            NewtonLexer lexer = new NewtonLexer(CharStreams.fromFileName(INPUT));
            CommonTokenStream tokens = new CommonTokenStream(lexer);

            NewtonParser parser = new NewtonParser(tokens);
            ParserRuleContext ruleContext = parser.program();

          //  Trees.inspect(ruleContext, parser);

            MainVisitor visitor = new MainVisitor();
            visitor.visit(ruleContext);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
