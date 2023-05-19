public class CabinCrewMember {

    private String name;
    private Rank rank;

    public CabinCrewMember(String name, Rank rank){
        this.name = name;
        this.rank = rank;
    }

    public String getName(){
        return name;
    }

    public Rank getRank(){
        return rank;
    }

    public String makeAnnouncement(){
        return "Ladies and gentlemen, this is your flight attendant Dale Gribble speaking. Buckle up tight, 'cause we're about to embark on an adventure in the sky! Now, remember to keep your aluminum foil hats on for extra protection against those mind-reading government satellites. Sit back, relax, and enjoy the flight as we navigate the mysterious realms of the friendly skies. And don't worry, we have the best bug zappers on board to keep those pesky alien abductions at bay. Thank you for choosing this flight, and remember, the truth is out there!";
    }
}
