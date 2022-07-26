package OOP.WorkingWithAbstaction.Lab;

import java.util.Scanner;

public class _1_RhombusOfStars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        printRhombus(n);
    }

    private static void printRhombus(int size) {
        for (int i = 1; i <= size; i++) {
            printFigure(size - i, i);
        }

        for (int i = 1; i < size; i++) {
            printFigure(i, size - i);
        }
    }

    private static void printFigure(int firstCount, int secondCount) {
        for (int i = 0; i < firstCount; i++) {
            System.out.print(" ");
        }

        for (int i = 0; i < secondCount; i++) {
            System.out.print("* ");
        }
        System.out.println();
    }
}
