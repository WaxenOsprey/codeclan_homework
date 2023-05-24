import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ProductTest {

    Product product;

    @Before
    public void before(){
        product = Product.COLA;
    }

    @Test
    public void hasPrice(){
        assertEquals(100, product.getPriceInPence(), 0.0);
    }
}
