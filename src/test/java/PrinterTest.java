import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class PrinterTest {

    Printer printer;

    @Before
    public void before(){
        printer = new Printer(100);
    }

    @Test
    public void hasNumberOfPagesLeft(){
        assertEquals(100, printer.getNumPagesLeft());
    }
    @Test
    public void checkIfCanPrintAndReduceNumPagesLeft(){
        assertEquals(50, printer.checkAndPrint(25,2));
    }@Test
    public void checkIfNumPagesCanGoToZero(){
        assertEquals(0, printer.checkAndPrint(25,4));
    }
    @Test
    public void checkItWontPrintIfPrintRequestTooHigh(){
        assertEquals(100, printer.checkAndPrint(25, 5));
    }
}
