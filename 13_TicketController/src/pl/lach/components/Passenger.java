package pl.lach.components;

import java.util.Objects;

public class Passenger {

    private String firstName;
    private String lastName;
    private Ticket ticket;

    public Passenger(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Ticket getTicket() {
        return ticket;
    }

    public void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Passenger)) return false;
        Passenger passenger = (Passenger) o;
        return Objects.equals(getFirstName(), passenger.getFirstName()) &&
                Objects.equals(getLastName(), passenger.getLastName()) &&
                Objects.equals(getTicket(), passenger.getTicket());
    }

    @Override
    public int hashCode() {

        return Objects.hash(getFirstName(), getLastName(), getTicket());
    }

    @Override
    public String toString() {
        return "Passenger{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", ticket=" + ticket +
                '}';
    }
}
