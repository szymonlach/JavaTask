package pl.lach.components;

import java.time.LocalDateTime;

public class TicketMachine {

    public static Passenger buyTicket(Passenger passenger, int ticketDurationTime) {
        Ticket ticket = new Ticket(LocalDateTime.now(), ticketDurationTime);
        passenger.setTicket(ticket);
        return passenger;
    }
}
