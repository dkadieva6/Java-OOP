package OOP.Encapsulation.Exercise._2_AnimalFarm;

public class Chicken {
    private String name;
    private int age;

    public Chicken(String name, int age) {
        this.setName(name);
        this.setAge(age);
    }

    private void setName(String name) {
        if (name.trim().length() == 0) {
            throw new IllegalArgumentException("Name cannot be empty.");
        }

        this.name = name;
    }

    private void setAge(int age) {
        if (age <= 0 || age > 15) {
            throw new IllegalArgumentException("Age should be between 0 and 15.");
        }

        this.age = age;
    }

    public double productPerDay() {
        return this.calculateProductPerDay();
    }

    private double calculateProductPerDay() {
        if (age <= 5) {
            return 2;
        }

        if (age <= 11) {
            return 1;
        }

        return 0.75;
    }

    @Override
    public String toString() {
        return String.format("Chicken %s (age %d) can produce %.2f eggs per day.", name, age, productPerDay());
    }
}
