package pl.lach.components;

import java.util.List;
import java.util.Objects;

public class Building {

    private List<Room> rooms;

    public Building(List<Room> rooms) {
        this.rooms = rooms;
    }


    public List<Room> getRooms() {
        return rooms;
    }

    public void setRooms(List<Room> rooms) {
        this.rooms = rooms;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Building)) return false;
        Building building = (Building) o;
        return Objects.equals(getRooms(), building.getRooms());
    }

    @Override
    public int hashCode() {

        return Objects.hash(getRooms());
    }

    @Override
    public String toString() {
        return "Building{" +
                "rooms=" + rooms +
                '}';
    }
}
