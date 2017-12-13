/**
 * Created by Lukas Cerny.
 */
public class DataTypeFormatter {

    public static String formatValue(DataType dataType, int value) {
        switch (dataType) {
            case BOOL   : return value == 1 ? "true" : "false";
            case INT    : return String.valueOf(value);
            default     : return "";
        }
    }
}
