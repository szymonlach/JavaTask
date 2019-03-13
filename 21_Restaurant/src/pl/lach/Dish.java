package pl.lach;

import java.math.BigDecimal;
import java.util.Objects;

public class Dish {

    private String name;
    private BigDecimal price;

    public Dish(String name, BigDecimal price) {
        this.name = name;
        this.price = price.setScale(2,BigDecimal.ROUND_HALF_DOWN);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Dish)) return false;
        Dish dish = (Dish) o;
        return Objects.equals(getName(), dish.getName()) &&
                Objects.equals(getPrice(), dish.getPrice());
    }

    @Override
    public int hashCode() {

        return Objects.hash(getName(), getPrice());
    }

    @Override
    public String toString() {
        return "Dish{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
