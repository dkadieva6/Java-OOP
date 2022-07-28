package OOP.WorkingWithAbstaction.Exercise._3_CardsWithPower;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CardRank rank = CardRank.valueOf(scanner.nextLine());
        CardSuits suits = CardSuits.valueOf(scanner.nextLine());

        String output = Card.printInformation(suits, rank);
        System.out.println(output);
    }
}
