import org.antlr.v4.gui.Trees;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.IOException;

public class Main {
    private static final String INPUT = "testInput.txt";

    public static void main(String[]args) {

        NewtonLexer lexer;
        try {
            lexer = new NewtonLexer(CharStreams.fromFileName(INPUT));
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            NewtonParser parser = new NewtonParser(tokens);

            ParserRuleContext ruleContext = parser.program_begin();
            Trees.inspect(ruleContext, parser);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
