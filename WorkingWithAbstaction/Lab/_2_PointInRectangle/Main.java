package OOP.WorkingWithAbstaction.Lab._2_PointInRectangle;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    private static List<Integer> coordinatesGetFromConsole = null;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        coordinatesGetFromConsole = getCoordinatesFromConsole(scanner);

        Rectangle rectangle = createRectangle();

        int countOfPointsToCheck = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < countOfPointsToCheck; i++) {
            coordinatesGetFromConsole = getCoordinatesFromConsole(scanner);
            Point pointToCheck = getPoint(0, 1);
            System.out.println(rectangle.contains(pointToCheck));
        }
    }



    private static List<Integer> getCoordinatesFromConsole(Scanner scanner) {
        return Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());
    }

    private static Rectangle createRectangle() {
        Point bottomLeft = getPoint(0, 1);
        Point topRight = getPoint(2, 3);
        return new Rectangle(bottomLeft, topRight);
    }

    private static Point getPoint(int xIndex, int yIndex) {
        int X = coordinatesGetFromConsole.get(xIndex);
        int Y = coordinatesGetFromConsole.get(yIndex);
        return new Point(X, Y);
    }
}
