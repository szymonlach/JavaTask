package pl.lach;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Restaurant {

    private List<Dish> dishes;

    public Restaurant(List<Dish> dishes) {
        this.dishes = dishes;
    }

    public Restaurant() {
        dishes = new ArrayList<>();
    }

    public void addDish(Dish dish) {
        dishes.add(dish);
    }


    public void showDishes() {
        for (int i = 0; i < dishes.size(); i++) {
            System.out.printf("%d, %-20s %s\n", i + 1, dishes.get(i).getName(), dishes.get(i).getPrice());
        }
    }

    public void calculateOrder(String order) {
        List<Dish> orderedDishes = getListOfOrederedDishes(order.split(","));
        BigDecimal dueForFood = BigDecimal.ZERO.setScale(2, BigDecimal.ROUND_HALF_DOWN);
        for (Dish dish : orderedDishes) {
            dueForFood = dueForFood.add(dish.getPrice());
        }
        BigDecimal serviceCharge = calculateServiceCharge(dueForFood).setScale(2,BigDecimal.ROUND_HALF_DOWN);
        BigDecimal totalCharge = serviceCharge.add(dueForFood).setScale(2,BigDecimal.ROUND_HALF_DOWN);
        System.out.printf("Total Charge: %s\nDish Charge: %s\nService Charge: %s", totalCharge.toString(), dueForFood.toString(), serviceCharge.toString());

    }

    private BigDecimal calculateServiceCharge(BigDecimal dueForFood) {
        if (dueForFood.compareTo(BigDecimal.valueOf(100)) >= 0)
            return dueForFood.multiply(BigDecimal.valueOf(0.10).setScale(2, BigDecimal.ROUND_HALF_DOWN));
        else return dueForFood.multiply(BigDecimal.valueOf(0.15)).setScale(2, BigDecimal.ROUND_HALF_DOWN);
    }

    private List<Dish> getListOfOrederedDishes(String[] dishesNumbers) {
        List<Dish> orderedDishes = new ArrayList<>();
        for (String dishNumber : dishesNumbers) {
            orderedDishes.add(dishes.get(Integer.valueOf(dishNumber) - 1));
        }
        return orderedDishes;
    }

    public List<Dish> getDishes() {
        return dishes;
    }

}
