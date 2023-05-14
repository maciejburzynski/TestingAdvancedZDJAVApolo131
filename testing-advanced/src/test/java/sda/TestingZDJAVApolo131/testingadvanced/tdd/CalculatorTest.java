package sda.TestingZDJAVApolo131.testingadvanced.tdd;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {


    @Test
    void whenAddTwoNumbersThenReturnSumOfTheNumbers(){
//    void givenCalculatorWhenAddTwoNumbersThenReturnSumOfTheNumbers(){ <- with given
//    given
        Calculator calculator = new Calculator();
//    when
        int result = calculator.add(2,3);
//    then
        assertEquals(5, result);
        assertNotEquals(4, result);
    }
}
