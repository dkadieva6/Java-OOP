package OOP.InterfacesAndAbstaction.Lab._1_CarShop;

import java.io.Serializable;

public class Seat implements Car, Serializable {
    private String model;
    private String color;
    private Integer horsePower;
    private String countryProduced;

    public Seat(String model, String color, Integer horsePower, String countryProduced) {
        this.model = model;
        this.color = color;
        this.horsePower = horsePower;
        this.countryProduced = countryProduced;
    }

    public String toString() {
        //This is Leon produced in Spain and have 4 tire
        return "This is " + model + " produced in " + countryProduced + "and have " + TIRES + " tires";
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

    @Override
    public String countryProduced() {
        return countryProduced;
    }
}
