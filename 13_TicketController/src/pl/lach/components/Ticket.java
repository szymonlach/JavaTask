package pl.lach.components;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.Objects;

public class Ticket {

    private LocalDateTime buyTime;
    private int ticketValidityInMinutes;

    public Ticket(LocalDateTime buyTime, int ticketValidityInMinutes) {
        this.buyTime = buyTime;
        this.ticketValidityInMinutes = ticketValidityInMinutes;
    }

    public LocalDateTime getBuyTime() {
        return buyTime;
    }

    public int getTicketValidityInMinutes() {
        return ticketValidityInMinutes;
    }

    public boolean isValid() {
        LocalDateTime currentTime = LocalDateTime.now();
        Duration duration = Duration.between(buyTime, currentTime);
        if (duration.toMinutes() > 15) {
            return false;
        } else return true;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Ticket)) return false;
        Ticket ticket = (Ticket) o;
        return Objects.equals(getBuyTime(), ticket.getBuyTime()) &&
                Objects.equals(getTicketValidityInMinutes(), ticket.getTicketValidityInMinutes());
    }

    @Override
    public int hashCode() {

        return Objects.hash(getBuyTime(), getTicketValidityInMinutes());
    }

    @Override
    public String toString() {
        return "Ticket{" +
                "buyTime=" + buyTime +
                ", ticketValidityInMinutes=" + ticketValidityInMinutes +
                '}';
    }
}
