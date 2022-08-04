package OOP.InterfacesAndAbstaction.Lab._4_SayHelloExtended;

public class Bulgarian extends BasePerson implements Person {
    public Bulgarian(String name) {
        super(name);
    }

    public String sayHello() {
        return String.format("Здравей");
    }
}
