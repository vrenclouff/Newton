public class FunctionDefinition {

    private String name;
    private int address;

    public FunctionDefinition(String name) {
        this.name = name;
        this.address = 0;
    }

    public FunctionDefinition(String name, int address) {
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public int getAddress() {
        return address;
    }
}
