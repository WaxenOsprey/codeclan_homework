public class FlightManager {

    public FlightManager(){

    }

    public float calculateAvailableWeight(Flight flight){
        return (float)flight.getPlane().getTotal_weight_capacity() / 2;
    }

    public float calculateBaggagePerPassenger(Flight flight){
        int passengerCount = flight.getPlane().getPassengerCapacity();
        return calculateAvailableWeight(flight) / passengerCount;
    }

    public float calculateTotalBaggageBooked(Flight flight){
        int bagWeight = 100;
        float totalBookedIn = 0;
        for (Passenger passenger : flight.getBookedPassengers()){
            totalBookedIn += passenger.getNumberOfBags() * bagWeight;
        }
        return totalBookedIn;
    }

    public float calculateRemainingBaggageSpace(Flight flight){
        return calculateAvailableWeight(flight) - calculateTotalBaggageBooked(flight);
    }


}
