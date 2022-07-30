package OOP.Inheritance.Exercise._4_NeedForSpeed;

public class FamilyCar extends Car {
    public FamilyCar(double fuel, int horsePower) {
        super(fuel, horsePower);
        super.setFuelConsumption(super.getFuelConsumption());
    }
}
