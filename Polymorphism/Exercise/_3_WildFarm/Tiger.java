package OOP.Polymorphism.Exercise._3_WildFarm;

public class Tiger extends Felime {
    public String livingRegion;

    public Tiger(String animalName, String animalType, Double animalWeight, String livingRegion) {
        super(animalName, animalType, animalWeight, livingRegion);
    }

    @Override
    public void makeSound() {
        System.out.println("ROAAR!!!");
    }

    @Override
    public void eat(Food food) {
        if (food instanceof Vegetable) {
            throw new IllegalArgumentException("Tigers are not eating that type of food!");
        }
        super.eat(food);
    }
}
