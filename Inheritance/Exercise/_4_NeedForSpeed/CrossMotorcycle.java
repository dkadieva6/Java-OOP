package OOP.Inheritance.Exercise._4_NeedForSpeed;

public class CrossMotorcycle extends Motorcycle {
    public CrossMotorcycle(double fuel, int horsePower) {
        super(fuel, horsePower);
        super.setFuelConsumption(super.getFuelConsumption());
    }
}
