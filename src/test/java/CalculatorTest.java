import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CalculatorTest extends BaseTest {
    private static final double DELTA = 0.0001;

    @ParameterizedTest(name = "Adding: {1} + {2} = {0}")
    @CsvFileSource(resources = "/TestData/addData.csv")
    public void addTest(double expected, double a, double b){
        assertEquals(expected, calculator.add(a,b), DELTA);
    }

    @ParameterizedTest(name = "Subtracting: {1} - {2} = {0}")
    @CsvFileSource(resources = "/TestData/subtractData.csv")
    public void subtractTest(double expected, double a, double b){
        assertEquals(expected,calculator.subtract(a,b), DELTA);
    }

    @ParameterizedTest(name = "Multiplying: {1} * {2} = {0}")
    @CsvFileSource(resources = "/TestData/multiplyData.csv")
    public void multiplyTest(double expected, double a, double b){
        assertEquals(expected, calculator.multiply(a,b), DELTA);
    }

    @ParameterizedTest(name = "Dividing: {1} / {2} = {0}")
    @CsvFileSource(resources = "/TestData/divisionData.csv")
    public void divideTest(double expected, double a, double b){
        assertEquals(expected, calculator.divide(a,b));
    }

    @Test
    public void divideByZeroTest(){
        assertThrows(ArithmeticException.class, () -> calculator.divide(10,0));
    }
}
