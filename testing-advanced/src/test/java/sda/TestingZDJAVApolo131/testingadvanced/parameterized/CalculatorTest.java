package sda.TestingZDJAVApolo131.testingadvanced.parameterized;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import sda.TestingZDJAVApolo131.testingadvanced.tdd.Calculator;

public class CalculatorTest {
//    CSV = Comma separated value
//    1,5,6
//    4,8,12
//    15,15,30
//
//    Also CSV below
//    x,y,expected
    //    1,5,6
    //    4,8,12
    //    15,15,30

    @ParameterizedTest
    @CsvFileSource(resources = "calculator-add-test.csv")
    void whenAddTwoNumbersThenReturnSumOfTheNumbersParameterized(int x, int y, int expected) {
//  given
        Calculator calculator = new Calculator();
//  when
        int result = calculator.add(x, y);
//  then
        Assertions.assertThat(result).isEqualTo(expected);
    }

//    Please add parameterized tests for subtraction

}
