import org.junit.Before;
import org.junit.Test;

import java.util.Date;


import static org.junit.Assert.assertEquals;

public class FlightTest {

    Flight flight;
    Plane plane;
    Pilot pilot;
    CabinCrewMember cabinCrewMember1;
    CabinCrewMember cabinCrewMember2;
    Passenger passenger1;
    PlaneType planeType;
    Rank rank;

    FlightManager flightManager;

    @Before
    public void before(){
        plane = new Plane(planeType.BOEING_747);
        pilot = new Pilot("Boomhauer", rank.CAPTAIN, "BH12345");
        cabinCrewMember1 = new CabinCrewMember("Dale Gribble", rank.FLIGHT_ATTENDANT);
        cabinCrewMember2 = new CabinCrewMember("Bill Dauterive", rank.FIRST_OFFICER);
        Date departureTime = new Date();
        flight = new Flight(pilot, plane, "AA123", "ARN", "EDI", departureTime);

        flight.addCabinCrewMember(cabinCrewMember1);
        flight.addCabinCrewMember(cabinCrewMember2);

        passenger1 = new Passenger("Hank Hill", 2);
        flight.addPassenger(passenger1, flight);

        flightManager = new FlightManager();
    }

    @Test
    public void hasPlane(){
        assertEquals(planeType.BOEING_747, flight.getPlane().getPlaneType());
    }

    @Test
    public void hasPilot(){
        assertEquals("Boomhauer", flight.getPilot().getName());
    }

    @Test
    public void hasFlightNumber(){
        assertEquals("AA123", flight.getFlightNumber());
    }

    @Test
    public void hasDestination(){
        assertEquals("ARN", flight.getDestination());
    }

    @Test
    public void hasDepartureAirport(){
        assertEquals("EDI", flight.getDepartureAirport());
    }

    @Test
    public void hasDepartureTime(){
        Date departureTime = new Date();
        assertEquals(departureTime, flight.getDepartureTime());
    }

    @Test
    public void canAddCrew(){
        assertEquals(2, flight.getCrew().size());
    }

    @Test
    public void canBookPassenger(){
        assertEquals(1, flight.getBookedPassengers().size());
    }

    @Test
    public void canReturnAvailableSeats(){
        assertEquals(599, flight.getAvailableSeats());
    }

    @Test
    public void canNotBookPassengerIfFull(){
        int capacity = flight.plane.getPassengerCapacity();
        for (int i = 0; i < capacity; i++){
            flight.addPassenger(passenger1, flight);
        }
        assertEquals(600, flight.getBookedPassengers().size());
    }

    @Test
    public void pilotCanFlyPlane(){
        assertEquals("Hey there, y'all, jus' wanna let y'all know 'bout our flight today, man! Buckle up, 'cause we 'bout to take off and head on down to our destination! Sit back, relax, and enjoy the ride, dang ol' smooth flyin' all the way!", flight.pilot.flyPlane());
    }

    @Test
    public void crewCanMakeAnnouncements(){
        assertEquals("Ladies and gentlemen, this is your flight attendant Dale Gribble speaking. Buckle up tight, 'cause we're about to embark on an adventure in the sky! Now, remember to keep your aluminum foil hats on for extra protection against those mind-reading government satellites. Sit back, relax, and enjoy the flight as we navigate the mysterious realms of the friendly skies. And don't worry, we have the best bug zappers on board to keep those pesky alien abductions at bay. Thank you for choosing this flight, and remember, the truth is out there!", cabinCrewMember1.makeAnnouncement());
    }

    @Test
    public void canCalculateBaggagePerPassenger(){
        assertEquals(375, flightManager.calculateBaggagePerPassenger(flight), 0.0);
    }

    @Test
    public void canCalculateTotalBaggageBooked(){
        assertEquals(200, flightManager.calculateTotalBaggageBooked(flight), 0.0);
    }

    @Test
    public void canCalculateRemainingBaggageSpace(){
        assertEquals(224800, flightManager.calculateRemainingBaggageSpace(flight), 0.0);
    }

    @Test
    public void passengerCanSetFlight(){
        passenger1.setFlight(flight);
        assertEquals(flight.flightNumber, passenger1.getFlight().flightNumber);
    }


}
