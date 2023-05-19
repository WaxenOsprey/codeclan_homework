import java.util.ArrayList;

public class Flight {

    Pilot pilot;
    ArrayList<CabinCrewMember> crew;
    ArrayList<Passenger> bookedPassengers;
    Plane plane;
    String flightNumber;
    String destination;
    String departureAirport;
    String departureTime;

    public Flight(Pilot pilot, Plane plane, String flightNumber, String destination, String departureAirport, String departureTime){
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

    public String getDepartureTime() {
        return departureTime;
    }

    public void addCabinCrewMember(CabinCrewMember newCabinCrewMember){
        crew.add(newCabinCrewMember);
    }

    public int getAvailableSeats(){
        return plane.planeType.getPassenger_capacity() - bookedPassengers.size();
    }

    public void addPassenger(Passenger newPassenger){
        if (getAvailableSeats() > 0){
            bookedPassengers.add(newPassenger);
        }
    }
}
