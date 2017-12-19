public class FunctionDefinition {

    private String name;
    private int address;
    private DataType returnType;


    public FunctionDefinition(String name, int address, DataType returnType) {
        this.name = name;
        this.address = address;
        this.returnType = returnType;
    }

    public String getName() {
        return name;
    }

    public int getAddress() {
        return address;
    }

    public DataType getReturnType() {
        return returnType;
    }
}
