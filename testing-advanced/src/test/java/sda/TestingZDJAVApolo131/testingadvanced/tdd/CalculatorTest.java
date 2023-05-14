package sda.TestingZDJAVApolo131.testingadvanced.tdd;


import org.assertj.core.api.Assertions;
import org.assertj.core.data.Percentage;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {

    Calculator calculator;

    @BeforeEach
    void initCalculator(){
        calculator = new Calculator();
    }

    @Test
    void whenAddTwoNumbersThenReturnSumOfTheNumbers(){
//    void givenCalculatorWhenAddTwoNumbersThenReturnSumOfTheNumbers(){ <- with given
//    given
        // Calculator initiated in @BeforeEach
//    when
        int result = calculator.add(2,3);
//    then
        assertEquals(5, result);
        assertNotEquals(4, result);
        Assertions.assertThat(result).isPositive(); // AssertJ
        Assertions.assertThat(result).isGreaterThan(2); // AssertJ
        Assertions.assertThat(result).isNotZero(); // AssertJ
        Assertions.assertThat(result).isCloseTo(4, Percentage.withPercentage(90)); // AssertJ
    }
    
//    add tests for subtraction in our Calculator

}
