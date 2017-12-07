import org.antlr.v4.gui.Trees;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.ParserRuleContext;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;

public class Main {
    private static final String INPUT = "testSimpleInput.txt";

//    private static final String INPUT = "testInput.txt";


    public static void main(String[]args) {
        try {
            NewtonLexer lexer = new NewtonLexer(CharStreams.fromFileName(INPUT));
            CommonTokenStream tokens = new CommonTokenStream(lexer);

            NewtonParser parser = new NewtonParser(tokens);
            ParserRuleContext ruleContext = parser.program();

         //   Trees.inspect(ruleContext, parser);

            MainVisitor visitor = new MainVisitor();
            visitor.visit(ruleContext);

            printMessages(visitor);
            printInstructions(visitor);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void printMessages(MainVisitor visitor) {
        List messages = visitor.getMessages();
        if (messages.isEmpty()) { return; }
        System.out.println("------ MESSAGES -------");
        visitor.getMessages().stream().forEach(System.out::println);
    }

    private static void printInstructions(MainVisitor visitor) {
        if (!visitor.getMessages().isEmpty()) { return; }
        Iterator instructions = visitor.getInstructions().iterator();
        int line = 1;
        System.out.println("----- INSTRUCTIONS ------");
        while(instructions.hasNext()) {
            System.out.println((line++) + "\t" + instructions.next());
        }
    }
}
