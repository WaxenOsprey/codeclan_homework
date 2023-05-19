import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PilotTest {

    Pilot pilot1;
    Rank rank;

    @Before
    public void before(){
        pilot1 = new Pilot("Boomhauer", rank.CAPTAIN, "BH12345");
    }

    @Test
    public void inheritsHasName(){
        assertEquals("Boomhauer", pilot1.getName());
    }

    @Test
    public void inheritsHasRank(){
        assertEquals(rank.CAPTAIN, pilot1.getRank());
    }

    @Test
    public void hasPilotLicenseNumber(){
        assertEquals("BH12345", pilot1.getPilotLicenceNumber());
    }
}
