import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CalculatorTest extends BaseTest {

    @Test
    public void addTest(){
        assertEquals(5, calculator.add(3,2));
    }

    @Test
    public void subtractTest(){
        assertEquals(5,calculator.subtract(8,3));
    }

    @Test
    public void multiplyTest(){
        assertEquals(25, calculator.multiply(5,5));
    }

    @Test
    public void divideTest(){
        assertEquals(10, calculator.divide(100,10));
    }

    @Test
    public void divideByZeroTest(){
        assertThrows(ArithmeticException.class, () -> calculator.divide(10,0));
    }
}
