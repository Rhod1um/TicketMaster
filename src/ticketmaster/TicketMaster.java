package ticketmaster;

import java.util.ArrayList;

public class TicketMaster {
    private ArrayList<Event> events = new ArrayList<>();


    public void addEvent(Event event){
        events.add(event);
    }

    public ArrayList<Event> getEvents(){
        return events;
    }

    public Event takeEventIDAndReturnEvent(int eventIdUserInput){
        for (int i=0; i<events.size(); i++){
            Event event = events.get(i);
            int eventID = event.getEventID();
            if (eventIdUserInput == eventID){
                return event;
            }
        }
        return null;
    }

    public TicketStatus checkTicketAvailability(int eventIdUserInput, int amountOfTicketsWishedToBuy){
        Event event = takeEventIDAndReturnEvent(eventIdUserInput);
        int amountOfTicketsAvailable = event.getAmountOfTickets();

        if (event == null)
            return TicketStatus.INCORRECT_ID;
        else if (amountOfTicketsAvailable == 0)
            return TicketStatus.TICKETS_OUT_OF_STOCK;
        else if (amountOfTicketsWishedToBuy > amountOfTicketsAvailable)
            return TicketStatus.NOT_ENOUGH_TICKETS;
        else return TicketStatus.TICKETS_ARE_AVAILABLE;
    }

    public String buyTicket(int eventIdUserInput, int amountOfTicketsWishedToBuy){
        TicketStatus ticketstatus = checkTicketAvailability(eventIdUserInput, amountOfTicketsWishedToBuy);
        Event event = takeEventIDAndReturnEvent(eventIdUserInput);

        if (ticketstatus == TicketStatus.TICKETS_ARE_AVAILABLE)
            return "You bought: " + amountOfTicketsWishedToBuy + " " + event.getTicketDescription() +
                    " " + event.getTicketPrice() + " kr. ID: " + event.getEventID();
        else
            return ticketstatus.name();
    }

}
