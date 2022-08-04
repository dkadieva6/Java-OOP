package OOP.Polymorphism.Exercise._1_Vehicles;

public class Truck extends Vehicle {
    private final static double ADDITIONAL_AC_CONSUMPTION = 1.6;
    private final static double TANK_LEAKAGE_MULTIPLIER = 0.95;

    public Truck(double fuelQuantity, double fuelConsumption) {
        super(fuelQuantity, fuelConsumption + ADDITIONAL_AC_CONSUMPTION);
    }

    @Override
    public void refuel(double liters) {
        liters *= TANK_LEAKAGE_MULTIPLIER;
        super.refuel(liters);
    }
}
