import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CreditCardTest {

    CreditCard creditCard;

    @Before
    public void before(){
        creditCard = new CreditCard(123456789, 1524, 234, 100.00f);
    }

    @Test
    public void hasCardNumber(){
        assertEquals(123456789, creditCard.getCardNumber(), 0.0);
    }

    @Test
    public void hasExpiryDate(){
        assertEquals(1524, creditCard.getExpiryDate(), 0.0);
    }

    @Test
    public void hasSecurityNumber(){
        assertEquals(234, creditCard.getSecurityNumber(), 0.0);
    }

    @Test
    public void hasAvailableCredit(){
        assertEquals(100.00, creditCard.getAvailableCredit(), 0.0);
    }
}
