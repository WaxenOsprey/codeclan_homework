public class Pilot extends CabinCrewMember{

    String pilotLicenceNumber;

    public Pilot(String name, Rank rank, String pilotLicenceNumber){
        super(name, rank);
        this.pilotLicenceNumber = pilotLicenceNumber;
    }

    public String getPilotLicenceNumber(){
        return pilotLicenceNumber;
    }

    public String getName(){
        return super.getName();
    };

    public Rank getRank(){
        return super.getRank();
    }

    public String flyPlane(){
        return "Hey there, y'all, jus' wanna let y'all know 'bout our flight today, man! Buckle up, 'cause we 'bout to take off and head on down to our destination! Sit back, relax, and enjoy the ride, dang ol' smooth flyin' all the way!";
    }


}
