import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WaterBottleTest {

    WaterBottle myWaterBottle;

    @Before
    public void setup() {
        myWaterBottle = new WaterBottle();
    }

    @Test
    public void hasVolume(){
        assertEquals(100, myWaterBottle.volume);
    }

    @Test
    public void canDrink(){
        myWaterBottle.drink();
        assertEquals(90, myWaterBottle.volume);
    }

    @Test
    public void canEmpty(){
        myWaterBottle.empty();
        assertEquals(0, myWaterBottle.volume);
    }

    @Test
    public void canFill(){
        myWaterBottle.fill();
        assertEquals(100, myWaterBottle.volume);
    }
}
