package OOP.InterfacesAndAbstaction.Lab._4_SayHelloExtended;

public class European extends BasePerson implements Person {
    public European(String name) {
        super(name);
    }

    public String sayHello() {
        return String.format("Hello");
    }
}
