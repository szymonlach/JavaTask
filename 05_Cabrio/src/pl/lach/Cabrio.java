package pl.lach;

import java.util.Objects;

/**
 * Define a Cabrio class representing a car with an opening roof. The car should store information about the name, brand, but also whether it is currently moving and whether the roof is open. The limitation is that it should not be possible to open or close the roof when the car is in motion. If the car is moving and someone tries to open or assemble the roof, an error message should be displayed and the roof should remain in its current position.
 *
 * In a separate class, create an object representing the car and test the opening of the roof in a situation where the car is in motion and at rest.
 */
public class Cabrio {

    private String name;
    private String producer;
    private boolean isMoving;
    private boolean isOpenRoof;

    public Cabrio(String name, String producer) {
        this.name = name;
        this.producer = producer;
        this.isMoving = false;
        this.isOpenRoof = false;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public boolean isMoving() {
        return isMoving;
    }

    public void setMoving(boolean moving) {
        isMoving = moving;
    }

    public boolean isOpenRoof() {
        return isOpenRoof;
    }

    public void setOpenRoof(boolean openRoof) {
        if (isMoving) {
            System.err.println("Car is moving you can't change the state of the roof");
        } else {
            this.isOpenRoof = openRoof;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Cabrio)) return false;
        Cabrio cabrio = (Cabrio) o;
        return isMoving() == cabrio.isMoving() &&
                isOpenRoof() == cabrio.isOpenRoof() &&
                Objects.equals(getName(), cabrio.getName()) &&
                Objects.equals(getProducer(), cabrio.getProducer());
    }

    @Override
    public int hashCode() {

        return Objects.hash(getName(), getProducer(), isMoving(), isOpenRoof());
    }

    @Override
    public String toString() {
        return "Cabrio{" +
                "name='" + name + '\'' +
                ", producer='" + producer + '\'' +
                ", isMoving=" + isMoving +
                ", isOpenRoof=" + isOpenRoof +
                '}';
    }
}
