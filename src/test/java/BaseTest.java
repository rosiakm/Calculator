import models.Calculator;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BaseTest {
    static Logger logger = LoggerFactory.getLogger(BaseTest.class);

    protected static Calculator calculator;

    @BeforeAll
    public static void setupAll(){
        logger.info("==== I am raising new Calculator instance ====");
        calculator = new Calculator();
    }

    @AfterAll
    public static void tearDownAll(){
        logger.info("====The tests are finished====");
    }
}
