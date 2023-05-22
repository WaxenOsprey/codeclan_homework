import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class WalletTest {

    Wallet wallet;

    CreditCard creditCard;
    DebitCard debitCard;
    GiftCard giftCard;

    @Before
    public void before(){
        wallet = new Wallet();
        creditCard = new CreditCard(123456789, 1524, 234, 100.00f);
        debitCard = new DebitCard(987654321, 1625, 431, 12345678, "012345");
        giftCard = new GiftCard(100.0f);
    }

    @Test
    public void canAdd(){
        wallet.addChargeable(creditCard);
        ArrayList<IChargeable> result = wallet.getChargeables();
        assertEquals(1, result.size());
    }

    @Test
    public void canSelect(){
        wallet.selectChargeable(debitCard);
        assertEquals(debitCard, wallet.getSelectedChargeable());
    }

    @Test
    public void canPay(){
        wallet.selectChargeable(creditCard);
        wallet.pay(10);
        assertEquals(89.5, ((CreditCard) wallet.getSelectedChargeable()).getAvailableCredit(), 0.0);
    }

}
