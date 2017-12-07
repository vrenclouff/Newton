/**
 * Created by Lukas Cerny.
 */
public class Variable {

    private String name;
    private DataType dataType;
    private String stackPosition;

    public Variable(String name, DataType dataType, String stackPosition) {
        this.name = name;
        this.dataType = dataType;
        this.stackPosition = stackPosition;
    }

    public Variable(String name, DataType dataType, int stackPosition) {
        this(name, dataType, String.valueOf(stackPosition));
    }

    public String getName() {
        return name;
    }

    public DataType getDataType() {
        return dataType;
    }

    public String getStackPosition() {
        return stackPosition;
    }

    @Override
    public String toString() {
        return dataType + " " + name;
    }
}