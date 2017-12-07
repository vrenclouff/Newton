/**
 * Created by Lukas Cerny.
 */
public class Variable {

    private String name;
    private DataType dataType;
    private Double value;
    private String stackPosition;

    public Variable(String name, DataType dataType, String stackPosition) {
        this.name = name;
        this.dataType = dataType;
        this.value = new Double(0);
        this.stackPosition = stackPosition;
    }

    public Double getValue() {
        return value;
    }

    public void setValue(Double value) {
        this.value = value;
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
        return dataType + " " + name + " = " + DataTypeFormatter.formatValue(dataType, value);
    }
}