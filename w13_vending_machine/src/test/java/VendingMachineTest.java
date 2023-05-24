import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class VendingMachineTest {

    VendingMachine vendingMachine;
    Product product;

    @Before
    public void before(){
        vendingMachine = new VendingMachine();
    }

    @Test
    public void hasInsertedCoinList(){
        assertEquals(0, vendingMachine.getInsertedCoins().size(), 0.0);
    }

    @Test
    public void hasCoinFloat(){
        assertEquals(0, vendingMachine.getCoinFloat().size(), 0.0);
    }

    @Test
    public void hasCurrentAmount(){
        assertEquals(0, vendingMachine.getCurrentAmount(), 0.0);
    }

    @Test
    public void hasInventory(){
        assertEquals(0, vendingMachine.getInventory().size(), 0.0);
    }

    @Test
    public void canAddAndRemoveProducts(){
        vendingMachine.addProduct(product.COLA);
        vendingMachine.addProduct(product.CRISPS);
        System.out.println(vendingMachine.getInventory());
        assertEquals(2, vendingMachine.getInventory().size(), 0.0);
        vendingMachine.removeProduct(product.CRISPS);
        assertEquals(1, vendingMachine.getInventory().size(), 0.0);
        System.out.println(vendingMachine.getInventory());
    }

    @Test
    public void canRejectInvalidCoin(){
        assertEquals(false, vendingMachine.validateCoin(Coin.P2));
    }

    @Test
    public void canAcceptValidCoin(){
        assertEquals(true, vendingMachine.validateCoin(Coin.P20));
    }

    @Test
    public void canInsertCoin(){
        vendingMachine.insertCoin(Coin.P50);
        assertEquals(50, vendingMachine.getInsertedCoins().get(0).getValueInPence());
    }

    @Test
    public void canTally(){
        vendingMachine.insertCoin(Coin.P10);
        vendingMachine.insertCoin(Coin.P100);
        assertEquals(110, vendingMachine.getCurrentAmount(), 0.0);
    }

    @Test
    public void canReturnCoins(){
        vendingMachine.insertCoin(Coin.P10);
        vendingMachine.insertCoin(Coin.P100);
        vendingMachine.returnCoins(vendingMachine.getInsertedCoins());
        assertEquals(0, vendingMachine.getInsertedCoins().size(), 0.0);
        assertEquals(0, vendingMachine.getCurrentAmount(), 0.0);
    }

    @Test
    public void canCollectCoins(){
        vendingMachine.insertCoin(Coin.P10);
        vendingMachine.insertCoin(Coin.P100);
        vendingMachine.insertCoin(Coin.P50);
        vendingMachine.collectCoins();
        assertEquals(3, vendingMachine.getCoinFloat().size());
        assertEquals(0, vendingMachine.getInsertedCoins().size());
    }

    @Test
    public void canSelectAffordableProduct(){
        vendingMachine.insertCoin(Coin.P10);
        vendingMachine.insertCoin(Coin.P100);
        vendingMachine.addProduct(product.CRISPS);
        Object result = vendingMachine.selectProduct(product.CRISPS);
        assertEquals(product.CRISPS, result);
    }

    @Test
    public void cantSelectUnaffordableProduct(){
        vendingMachine.insertCoin(Coin.P10);
        vendingMachine.addProduct(product.CRISPS);
        Object result = vendingMachine.selectProduct(product.CRISPS);
        assertEquals(40.0, result);
    }
}
