package OOP.Inheritance.Exercise._4_NeedForSpeed;

public class Motorcycle extends Vehicle {
    public Motorcycle(double fuel, int horsePower) {
        super(fuel, horsePower);
        super.setFuelConsumption(super.getFuelConsumption());
    }
}
