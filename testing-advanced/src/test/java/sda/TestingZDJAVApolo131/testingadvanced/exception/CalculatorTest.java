package sda.TestingZDJAVApolo131.testingadvanced.exception;

import org.junit.jupiter.api.Test;
import sda.TestingZDJAVApolo131.testingadvanced.tdd.Calculator;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {

    @Test
    void whenTryToDivideByZeroThenDividingByZeroExceptionIsThrown() {
        //    given
        Calculator calculator = new Calculator();
        //    when + then
        assertThrows(DividingByZeroException.class, () -> calculator.divide(3, 0));
    }
}
