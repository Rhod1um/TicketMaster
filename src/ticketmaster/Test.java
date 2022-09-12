package ticketmaster;

import java.util.ArrayList;
import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        TicketMaster ticketMaster = new TicketMaster();

        Venue Vega = new Venue("Vega");
        Event event1 = new Event(1500, 1000, "ticket for Tools concert", Vega);
        ticketMaster.addEvent(event1);
        ArrayList<Event> events;
        events = ticketMaster.getEvents();
        System.out.println(events);

        System.out.println(ticketMaster.buyTicket(1,2));
    }
}
