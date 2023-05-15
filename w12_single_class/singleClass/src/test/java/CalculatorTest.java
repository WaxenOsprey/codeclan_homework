import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    Calculator myCalculator;

    @Before
    public void setup() {
        myCalculator = new Calculator();
    }

    @Test
    public void canAdd() {
        assertEquals(10, myCalculator.add(5, 5));
    }

    @Test
    public void canSubtract(){
        assertEquals(0, myCalculator.subtract(5, 5));
    }

    @Test
    public void canMultiply(){
        assertEquals(25, myCalculator.multiply(5, 5));
    }

    @Test
    public void canDivide(){
        assertEquals(1, myCalculator.divide(5, 5), 0.0);
    }
}
