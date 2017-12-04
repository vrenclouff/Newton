import org.antlr.v4.runtime.ParserRuleContext;

import java.text.MessageFormat;

/**
 * Created by Lukas Cerny.
 */
public class MessageUtil {

    public static String create(MessageType type, ParserRuleContext ctx) {
        int line = ctx.getStart().getCharPositionInLine();
        return MessageFormat.format(type.getPattern(), line);
    }
}
