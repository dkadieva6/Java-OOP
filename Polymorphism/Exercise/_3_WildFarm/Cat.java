package OOP.Polymorphism.Exercise._3_WildFarm;

import java.text.DecimalFormat;

public class Cat extends Felime {
    public String breed;

    public Cat(String animalName, String animalType, Double animalWeight, String livingRegion, String breed) {
        super(animalName, animalType, animalWeight, livingRegion);
        this.breed = breed;
    }

    @Override
    public void makeSound() {
        System.out.println("Meowwww");
    }

    @Override
    public void eat(Food food) {
        super.eat(food);
    }

    @Override
    public String toString() {
        DecimalFormat formatWeight = new DecimalFormat("##.##");
        return String.format("%s[%s, %s, %s, %s, %d]",
                getClass().getSimpleName(),
                getAnimalName(),
                breed,
                formatWeight.format(getAnimalWeight()),
                getLivingRegion(),
                getFoodEaten());
    }
}
