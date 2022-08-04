package OOP.InterfacesAndAbstaction.Lab._4_SayHelloExtended;

public abstract class BasePerson implements Person {
    private String name;

    protected BasePerson(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    private void setName() {
        this.name = name;
    }
}
