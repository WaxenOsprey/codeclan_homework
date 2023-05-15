import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PrinterTest {

    Printer myPrinter;

    @Before
    public void setup() {
        myPrinter = new Printer();
    }

    @Test
    public void hasSheets(){
        assertEquals(100, myPrinter.sheets);
    }

    @Test
    public void canPrint(){
        myPrinter.print(10);
        assertEquals(90, myPrinter.sheets);
    }

    @Test
    public void reducesToner(){
        myPrinter.print(10);
        assertEquals(90, myPrinter.toner);
    }

    @Test
    public void willNotPrintWhenOutOfPaper(){
        myPrinter.print(110);
        assertEquals(100, myPrinter.sheets);
    }


}
