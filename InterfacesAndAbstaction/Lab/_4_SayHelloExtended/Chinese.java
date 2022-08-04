package OOP.InterfacesAndAbstaction.Lab._4_SayHelloExtended;

public class Chinese extends BasePerson implements Person {
    public Chinese(String name) {
        super(name);
    }

    public String sayHello() {
        return String.format("Djydjybydjy");
    }
}
