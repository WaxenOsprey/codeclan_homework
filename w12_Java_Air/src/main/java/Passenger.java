public class Passenger {

    private String name;
    private Integer numberOfBags;

    private Flight flight;

    private int seat;

    public Passenger (String name, Integer numberOfBags){
        this.name = name;
        this.numberOfBags = numberOfBags;
    }

    public String getName(){
        return name;
    }

    public Integer getNumberOfBags(){
        return numberOfBags;
    }

    public void setFlight(Flight flight){
        this.flight = flight;
    }

    public Flight getFlight(){
        return flight;
    }

    public void setSeat(int seat){
        this.seat = seat;
    }

    public int getSeat(){
        return seat;
    }
}
