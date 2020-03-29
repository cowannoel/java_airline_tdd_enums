import java.util.ArrayList;

public class Flight {

    private ArrayList<Passenger> passengers;
    private Plane plane;
    private String flightNumber;
    private String destination;
    private String departureAirport;
    private String departureTime;

    public Flight(Plane plane,
                  String flightNumber,
                  String destination,
                  String departureAirport,
                  String departureTime) {
        this.passengers = new ArrayList<Passenger>();
        this.plane = plane;
        this.flightNumber = flightNumber;
        this.destination = destination;
        this.departureAirport = departureAirport;
        this.departureTime = departureTime;
    }

    public int numberOfAvailableSeats() {
        return this.plane.getCapacity();
    }


    public void addPassenger(Passenger passenger) {
        this.passengers.add(passenger);
    }

    public int getNumberOfPassengers() {
        return this.passengers.size();
    }

    public boolean isEmpty() {
        return this.passengers.isEmpty();
    }

    public boolean isFull() {
        return getNumberOfPassengers() >= this.plane.getCapacity();


    }
}
