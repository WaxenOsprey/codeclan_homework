import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DebitCardTest {

    DebitCard debitCard;

    @Before
    public void before(){
        debitCard = new DebitCard(123456789, 1524, 234, 00000001, "a12435j");
    }

    @Test
    public void hasSecurityNumber(){
        assertEquals(00000001, debitCard.getAccountNumber(), 0.0);
    }

    @Test
    public void hasSortCode(){
        assertEquals("a12435j", debitCard.getSortCode());
    }
}
