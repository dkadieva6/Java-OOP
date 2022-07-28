package OOP.WorkingWithAbstaction.Exercise._1_CardSuit;

public enum CardSuits {
    CLUBS(0),
    DIAMONDS(1),
    HEARTS(2),
    SPADES(3);

    private int value;

    CardSuits(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public String toString() {
        //Ordinal value: 0; Name value: CLUBS
        //Ordinal value: 1; Name value: DIAMONDS
        //Ordinal value: 2; Name value: HEARTS
        //Ordinal value: 3; Name value: SPADES
        return "Ordinal value: " + value + "; Name value: ";
    }

    public static void printAll() {
        System.out.println("Card Suits:");
        for (CardSuits value : CardSuits.values()) {
            System.out.println(value + value.name());
        }
    }
}
