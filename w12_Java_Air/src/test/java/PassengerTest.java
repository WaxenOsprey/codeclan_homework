import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PassengerTest {

    Passenger passenger1;

    @Before
    public void before(){
        passenger1 = new Passenger("Hank Hill", 2);
    }

    @Test
    public void hasName(){
        assertEquals("Hank Hill", passenger1.getName());
    }

    @Test
    public void hasNumberOfBags(){
        assertEquals(2, passenger1.getNumberOfBags(), 0.0);
    }

}

