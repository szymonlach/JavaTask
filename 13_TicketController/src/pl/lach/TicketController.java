package pl.lach;

import pl.lach.components.Passenger;
import pl.lach.components.Ticket;
import pl.lach.components.TicketMachine;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

/**
 * Write a program that will simulate the role of the ticket controller. Tickets are allocated in electronic form and have a limited validity period.
 * <p>
 * Define classes:
 * 1. Ticket - represents the ticket, stores information about the time the ticket was deleted and its validity (expressed in minutes). Because tickets are sold exclusively in electronic form, the ticket after purchase is immediately "deleted",
 * 2. Passenger representing the passenger. It stores information about the name and surname. It may also have a Ticket object assigned, which means that the passenger has purchased a ticket.
 * 3. TicketMachine - represents a ticket machine. It has only one buyTicket method, which accepts as passenger's arguments and the time for which a given passenger buys a ticket and its task is to create a ticket and assign it to the transferred passenger object.
 * <p>
 * In the TicketController class, which should be the start class of the program, create a board of passengers and assign some tickets to them (some of which should be "out-dated"). Define a separate method that will check which passengers have a valid ticket. As a result, the method should return an array of passengers who do not have a valid ticket.
 */
public class TicketController {
    public static void main(String[] args) {

        Passenger[] passengers = new Passenger[]{
                new Passenger("Marcin", "Nowak"),
                new Passenger("Carl", "Kowalski"),
                new Passenger("Justyna", "As"),
                new Passenger("Alicja", "Kłos")
        };

        TicketMachine.buyTicket(passengers[0], 15);
        TicketMachine.buyTicket(passengers[1], 30);
        passengers[2].setTicket(new Ticket(LocalDateTime.now().minusMinutes(30), 15));

        Passenger[] passengersWithoutTickets = checkTickets(passengers);
        System.out.println("Passengers without tickets:");
        for (Passenger passenger : passengersWithoutTickets) {
            System.out.println(passenger.getFirstName() + " " + passenger.getLastName());
        }
    }

    public static Passenger[] checkTickets(Passenger[] passengers) {
        List<Passenger> passengersWithoutTicketList = new ArrayList<>();
        for (Passenger passenger : passengers) {
            if (passenger.getTicket() == null || !passenger.getTicket().isValid()) {
                passengersWithoutTicketList.add(passenger);
            }
        }
        Passenger[] passengersWithoutTicket = new Passenger[passengersWithoutTicketList.size()];
        for (int i = 0; i < passengersWithoutTicketList.size(); i++) {
            passengersWithoutTicket[i] = passengersWithoutTicketList.get(i);
        }

        return passengersWithoutTicket;
    }
}

