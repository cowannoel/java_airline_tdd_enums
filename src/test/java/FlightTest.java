import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class FlightTest {

    private Flight flight;
    private Plane plane;
    private Passenger passenger;


    @Before
    public void setUp(){
        plane = new Plane(PlaneType.BOEING747);
        flight = new Flight(
                plane,
                "LN233",
                "LDN",
                "EDI",
                "11:00");
        passenger = new Passenger("Jude", 2);
    }

    @Test
    public void canCheckNumberOfAvailableSeats(){
        assertEquals(1, flight.numberOfAvailableSeats());
    }
    @Test
    public void canAddPassenger(){
        flight.addPassenger(passenger);
        assertEquals(1, flight.getNumberOfPassengers());
    }

    @Test
    public void checkIfFlightIsEmpty (){
        flight.addPassenger(passenger);
        assertEquals(false , flight.isEmpty());
    }

    @Test
    public void checkIfFlightIsFull(){
        flight.addPassenger(passenger);
        assertEquals(true, flight.isFull());
    }


}
