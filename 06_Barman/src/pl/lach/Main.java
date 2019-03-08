package pl.lach;

import pl.lach.service.Bartender;
import pl.lach.service.Drink;
import pl.lach.service.Ingredient;

/**
 * Define the Bartender class, which has a few createDrinks that accept as the arguments the name and the amount of 3 ingredients needed to prepare the drink. As a result of this method, the drink can not fall. Each ingredient in the set of ingredients for the game due to its order.
 * <p>
 * The Bartender class should also have the printDrink method, which takes a Drink object as a parameter and displays the form information about it:
 * The ingredients of the drink are AAA, BBB, CCC in the proportions aaa, bbb, ccc, its capacity is zzz
 */
public class Main {
    public static void main(String[] args) {
        Bartender bartender = new Bartender();

        Drink myDrink = bartender.createDrink(new Ingredient("Apple juice", 100), new Ingredient("Malibu", 100), new Ingredient("Coconut Milk", 50));
        System.out.println(bartender.printDrink(myDrink));

    }
}
