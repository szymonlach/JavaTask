package pl.lach;

import java.math.BigDecimal;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Restaurant restaurant = initializeMenu();
        System.out.println("Welcome in restaurant");
        System.out.println("Menu:");
        restaurant.showDishes();
        System.out.println("Order food (enter the numbers separated by a comma)");
        String input = scanner.next();
        restaurant.calculateOrder(input);

    }

    private static Restaurant initializeMenu() {
        Restaurant restaurant = new Restaurant();
        restaurant.addDish(new Dish("Pizza Maggerita", BigDecimal.valueOf(24.99)));
        restaurant.addDish(new Dish("Pizza Pepperoni", BigDecimal.valueOf(29.99)));
        restaurant.addDish(new Dish("Spaghetti Bolognese", BigDecimal.valueOf(31.99)));
        restaurant.addDish(new Dish("Pizza Carbonara", BigDecimal.valueOf(26.99)));
        restaurant.addDish(new Dish("Lasagne", BigDecimal.valueOf(24.99)));
        restaurant.addDish(new Dish("Gazpacho", BigDecimal.valueOf(16.99)));
        restaurant.addDish(new Dish("Cannelloni", BigDecimal.valueOf(29.99)));
        restaurant.addDish(new Dish("Bruschetta", BigDecimal.valueOf(13.99)));
        restaurant.addDish(new Dish("Tiramisu", BigDecimal.valueOf(19.99)));
        restaurant.addDish(new Dish("Panna Cotta", BigDecimal.valueOf(19.99)));
        return restaurant;
    }
}
