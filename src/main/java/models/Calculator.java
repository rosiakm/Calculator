package models;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Calculator {
    Logger logger = LoggerFactory.getLogger(Calculator.class);

    public Double add(double a, double b){
        logger.info("I am adding: {} and {}", a, b);
        return a + b;
    }

    public Double subtract(double a, double b){
        logger.info("I am subtracting: {} and {}", a, b);
        return  a - b;
    }

    public Double multiply(double a, double b){
        logger.info("I am multiplying: {} and {}", a, b);
        return a * b;
    }

    public Double divide(double a, double b){
        if(b == 0){
            logger.info("The arithmetic exception has been thrown");
            throw new ArithmeticException("The divisor equals 0");
        }
        logger.info("I am dividing: {} and {}", a, b);
        return a/b;
    }
}
