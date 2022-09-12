package ticketmaster;

public class Event {
    private double ticketPrice;
    private int amountOfTickets;
    private String ticketDescription;
    private Venue venue;
    private int eventID;
    private static int numberOfEvents;

    Event(double ticketPrice, int amountOfTickets, String ticketDescription, Venue venue){
        setTicketPrice(ticketPrice);
        setAmountOfTickets(amountOfTickets);
        setTicketDescription(ticketDescription);
        setVenue(venue);

        eventID = ++numberOfEvents; //når plusserne er først starter den på 1
    }

    public void setTicketPrice(double ticketPrice){
        this.ticketPrice=ticketPrice;
    }
    public void setAmountOfTickets(int amountOfTickets){
        this.amountOfTickets=amountOfTickets;
    }
    public void setTicketDescription(String ticketDescription){
        this.ticketDescription=ticketDescription;
    }
    public void setVenue(Venue venue) {
        this.venue = venue;
    }

    public double getTicketPrice(){
        return ticketPrice;
    }
    public int getAmountOfTickets(){
        return amountOfTickets;
    }
    public String getTicketDescription(){
        return ticketDescription;
    }
    public Venue getVenue(){
        return venue;
    }
    public int getEventID(){
        return eventID;
    }
    public static int getNumberOfEvents(){ //returnere sum af events.
        // statisk variabel returneres typisk af statisk metode
        //når man kalder en statisk metode bruges klassenavnet fm for objektnavnet, så Event.getNumberOfEvents;
        return numberOfEvents;
    }

    @Override
    public String toString() {
        return "Event{" +
                "ticketPrice=" + ticketPrice +
                ", amountOfTickets=" + amountOfTickets +
                ", ticketDescription='" + ticketDescription + '\'' +
                ", venue=" + venue +
                ", eventID=" + eventID +
                '}';
    }
}
