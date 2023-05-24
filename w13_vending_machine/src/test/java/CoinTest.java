import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CoinTest {

    Coin coin;

    @Before
    public void before(){
        coin = Coin.P10;
    }

    @Test
    public void hasValue(){
        assertEquals(10, coin.getValueInPence(), 0.0);
    }
}
