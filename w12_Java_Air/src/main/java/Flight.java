import java.util.ArrayList;
import java.util.Date;

public class Flight {

    Pilot pilot;
    ArrayList<CabinCrewMember> crew;
    ArrayList<Passenger> bookedPassengers;
    Plane plane;
    String flightNumber;
    String destination;
    String departureAirport;
    Date departureTime;

    public Flight(Pilot pilot, Plane plane, String flightNumber, String destination, String departureAirport, Date departureTime){
        this.pilot = pilot;
        this.plane = plane;
        this.flightNumber = flightNumber;
        this.destination = destination;
        this.departureAirport = departureAirport;
        this.departureTime = departureTime;
        this.crew = new ArrayList<CabinCrewMember>();
        this.bookedPassengers = new ArrayList<Passenger>();
    }

    public Pilot getPilot() {
        return pilot;
    }

    public ArrayList<CabinCrewMember> getCrew() {
        return crew;
    }

    public ArrayList<Passenger> getBookedPassengers() {
        return bookedPassengers;
    }

    public Plane getPlane() {
        return plane;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public String getDestination() {
        return destination;
    }

    public String getDepartureAirport() {
        return departureAirport;
    }

    public Date getDepartureTime() {
        return departureTime;
    }

    public void addCabinCrewMember(CabinCrewMember newCabinCrewMember){
        crew.add(newCabinCrewMember);
    }

    public int getAvailableSeats(){
        return plane.planeType.getPassenger_capacity() - bookedPassengers.size();
    }

    public void addPassenger(Passenger newPassenger, Flight flight){
        if (getAvailableSeats() > 0){
            bookedPassengers.add(newPassenger);
            newPassenger.setFlight(flight);
            setSeatNumber(newPassenger);
        }
    }

    public void setSeatNumber(Passenger newPassenger){
        int max = plane.planeType.getPassenger_capacity();

        //loop and regenerate a seat number until checkSeatAvailable() returns true, then setSeat;
        Boolean seatFound = false;
        while (!seatFound && getBookedPassengers().size() < plane.planeType.getPassenger_capacity()){
            RandomNumberGenerator rng = new RandomNumberGenerator(max);
            int randomNumber = rng.getRandomNumber();
            if (checkSeatAvailable(randomNumber)){
                newPassenger.setSeat(randomNumber);
                seatFound = true;
            }
        }
    }
    public Boolean checkSeatAvailable(int randomNumber) {
        for (Passenger passenger : getBookedPassengers()) {
            int seat = passenger.getSeat();
            if (randomNumber == seat) {
                return false;
            }
        }
        return true;
    }

    }
