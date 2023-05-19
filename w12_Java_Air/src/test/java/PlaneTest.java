import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlaneTest {

    Plane plane;
    PlaneType planeType;

    @Before
    public void before(){
        plane = new Plane(planeType.BOEING_747);
    }

    @Test
    public void hasType(){
        assertEquals(planeType.BOEING_747, plane.getPlaneType());
    }

    @Test
    public void hasPassengerCapacity(){
        assertEquals(600, plane.getPassengerCapacity());
    }

    @Test
    public void hasTotalWeightCapacity(){
        assertEquals(450000, plane.getTotal_weight_capacity());
    }
}
