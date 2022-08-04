package OOP.InterfacesAndAbstaction.Lab._6_Ferrari;

public class Ferrari implements Car {
    private String driverName;
    private static final String model = "488-Spider";

    public Ferrari(String driverName) {
        this.driverName = driverName;
    }

    public String brakes() {
        return "Brakes!";
    }

    public String gas() {
        return "brum-brum-brum-brrrrr";
    }

    public String toString() {
        return String.format("%s%s%s%s", model, brakes(), gas(), driverName);
    }
}
