package pl.lach.service;

import java.util.Arrays;
import java.util.List;

public class Bartender {

    public Drink createDrink(Ingredient ingredient1, Ingredient ingredient2, Ingredient ingredient3) {
        List<Ingredient> drinkIngredients = Arrays.asList(ingredient1, ingredient2, ingredient3);
        return new Drink(drinkIngredients);
    }

    public String printDrink(Drink drink) {
        double sum = 0;

        for (Ingredient ingredient : drink.drinkIngredients) {
            sum +=ingredient.getQuantity();
        }

        double proportion1 = drink.drinkIngredients.get(0).getQuantity() / sum;
        double proportion2 = drink.drinkIngredients.get(1).getQuantity() / sum;
        double proportion3 = drink.drinkIngredients.get(2).getQuantity() / sum;
        String ingredientName1 = drink.drinkIngredients.get(0).getName();
        String ingredientName2 = drink.drinkIngredients.get(1).getName();
        String ingredientName3 = drink.drinkIngredients.get(2).getName();

        return String.format("The ingredients of the drink are %s, %s, %s in the proportions %.2f, %.2f, %.2f, its capacity is %d\n", ingredientName1, ingredientName2, ingredientName3, proportion1, proportion2, proportion3, (int)sum);
    }
}
