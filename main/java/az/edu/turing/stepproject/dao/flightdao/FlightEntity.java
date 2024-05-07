package az.edu.turing.stepproject.dao.flightdao;

public class FlightEntity {
    public final String date;
    public final String destination;
    public final int freeSeats;
    public int ID;

    public FlightEntity(String date, String destination, int freeSeats) {
        this.date = date;
        this.destination = destination;
        this.freeSeats = freeSeats;
    }

    public FlightEntity(String date, String destination, int freeSeats, int ID) {
        this.date = date;
        this.destination = destination;
        this.freeSeats = freeSeats;
        this.ID = ID;
    }

}
