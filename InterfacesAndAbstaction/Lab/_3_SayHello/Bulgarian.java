package OOP.InterfacesAndAbstaction.Lab._3_SayHello;

public class Bulgarian implements Person {
    private String name;

    public Bulgarian(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    public String sayHello() {
        return String.format("Здравей");
    }
}
