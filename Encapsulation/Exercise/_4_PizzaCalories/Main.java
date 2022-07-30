package OOP.Encapsulation.Exercise._4_PizzaCalories;

import java.util.Scanner;

public class Main {
    static String[] input = null;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //read pizza
        //Pizza {pizzaName} {numberOfToppings}
        readAttributes(scanner);

        try {
            Pizza pizza = new Pizza(input[1], Integer.parseInt(input[2]));

            //read dough
            //Dough {flourType} {bakingTechnique} {weightInGrams}
            readAttributes(scanner);

            Dough dough = new Dough(input[1], input[2], Double.parseDouble(input[3]));
            pizza.setDough(dough);

            //read topping;
            readAttributes(scanner);

            while (!"END".equals(input[0])) {
                //Topping {toppingType} {weightInGrams}
                Topping topping = new Topping(input[1], Double.parseDouble(input[2]));

                pizza.addTopping(topping);
                readAttributes(scanner);
            }

            System.out.printf("%s - %.2f", pizza.getName(), pizza.getOverallCalories());

        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

    private static void readAttributes(Scanner scanner) {
        input = scanner.nextLine().split("\\s+");
    }
}

/*
Pizza Meatless 2
Dough Wholegrain Crispy 100
Topping Veggies 50
Topping Cheese 50
END

Pizza Bulgarian 20
Dough Type500 Bulgarian 100
Topping Cheese 50
Topping Cheese 50
Topping Salami 20
Topping Meat 10
END

Pizza Bulgarian 2
Dough Type500 Bulgarian 100
Topping Cheese 50
Topping Cheese 50
Topping Salami 20
Topping Meat 10
END

Pizza Bulgarian 2
Dough White Chewy 100
Topping Parmesan 50
Topping Cheese 50
Topping Salami 20
Topping Meat 10
END
*/