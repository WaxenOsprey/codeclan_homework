import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GiftCardTest {

    GiftCard giftCard;

    @Before
    public void before(){
        giftCard = new GiftCard(100.00f);
    }

    @Test
    public void hasBalance(){
        assertEquals(100.00, giftCard.getBalance(), 0.0);
    }

    @Test
    public void canCharge(){
        giftCard.charge(10);
        assertEquals(90.00f, giftCard.getBalance(), 0.0);
    }
}
