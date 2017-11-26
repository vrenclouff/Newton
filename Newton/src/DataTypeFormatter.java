/**
 * Created by Lukas Cerny.
 */
public class DataTypeFormatter {

    public static String formatValue(DataType dataType, Double value) {
        switch (dataType) {
            case BOOL   : return value.intValue() == 1 ? "true" : "false";
            case INT    : return String.valueOf(value.intValue());
            case DOUBLE : return value.toString();
            default     : return "";
        }
    }
}
