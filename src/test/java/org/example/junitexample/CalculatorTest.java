package org.example.junitexample;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static java.util.Collections.emptyList;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {
    @Test
    void shouldReturnAdditionFiveForTwoPlusThree() {
        assertEquals(5,new Calculator().addition(2,3));
    }
    @Test
    void shouldReturnAdditionFiveForTenMinusFive() {
        assertEquals(5,new Calculator().subtraction(10,5));

    }
    @Test
    void shouldBeEvenWhenGivenNumIsTwo() {
        assertTrue(new Calculator().isEven(10));
    }
    @Test
    void shouldBeOddWhenGivenNumberIsSeven() {
        assertFalse(new Calculator().isEven(7));

    }
    @Test
    void shouldReturnEvenForTheEvenElement() {
        List<Integer> inputArray = new ArrayList<>(Arrays.asList(1,2,3,4,5,6));
        List<Integer> expectedArray = new ArrayList<>(Arrays.asList(2,4,6));
        assertEquals(expectedArray,new Calculator().getEvenNumbers(inputArray));
    }
    @Test
    void shouldReturnEmptyResultAndPrintProperErrorMsgWhenWePassEmptyInputArray() {
        assertEquals(emptyList(),new Calculator().getEvenNumbers(emptyList());
    }
    @Test
    void shouldReturnEmptyResultAndPrintProperErrorMsgWhenWePassNullInputArray() {
        assertEquals(emptyList(),new Calculator().getEvenNumbers(null);
    }
}
