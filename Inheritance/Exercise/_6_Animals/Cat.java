package OOP.Inheritance.Exercise._6_Animals;

public class Cat extends Animal {
    public Cat(String name, int age, String gender) {
        super(name, age, gender);
    }

    @Override
    public String produceSound() {
        return Messages.CAT_SOUND;
    }
}
