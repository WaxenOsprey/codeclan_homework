import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CabinCrewMemberTest {

    CabinCrewMember cabinCrewMember1;
    Rank rank;

    @Before
    public void before(){
        cabinCrewMember1 = new CabinCrewMember("Boomhower", rank.FLIGHT_ATTENDANT);
    }

    @Test
    public void hasName(){
        assertEquals("Boomhower", cabinCrewMember1.getName());
    }

    @Test
    public void hasRank(){
        assertEquals(rank.FLIGHT_ATTENDANT, cabinCrewMember1.getRank());
    }
}
