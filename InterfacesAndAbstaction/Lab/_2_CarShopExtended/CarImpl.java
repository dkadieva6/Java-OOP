package OOP.InterfacesAndAbstaction.Lab._2_CarShopExtended;

import java.io.Serializable;

public class CarImpl implements Car, Serializable {
    private String model;
    private String color;
    private Integer horsePower;
    private String countryProduced;

    public CarImpl(String model, String color, Integer horsePower, String countryProduced) {
        this.model = model;
        this.color = color;
        this.horsePower = horsePower;
        this.countryProduced = countryProduced;
    }

    @Override
    public String toString() {
        //This is Leon produced in Spain and have 4 tires
        return String.format("This is %s produced in %s and have %d tires%n", model, countryProduced, TIRES);
    }

    @Override
    public String getModel() {
        return model;
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public Integer getHorsePower() {
        return horsePower;
    }

    public String countryProduced() {
        return countryProduced;
    }
}
