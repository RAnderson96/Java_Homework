import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    Calculator calculator;

    @Before
    public void before(){ calculator= new Calculator();}
    @Test
    public void canAdd(){
        assertEquals(10, calculator.addValues(5,5));
    }@Test
    public void canSubtract(){
        assertEquals(0, calculator.subtractValues(5,5));
    }@Test
    public void canDivide(){
        assertEquals(1, calculator.divideValues(5,5), 0.0);
    }

}
