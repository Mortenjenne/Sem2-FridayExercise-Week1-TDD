package io.github.mortenjenne.tdd;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    private Calculator calculator = new Calculator();

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @DisplayName("Test add method")
    @Test
    void testTwoPlusTwo(){
        int expected = 4;
        int actual = calculator.add(2,2);
        assertEquals(expected,actual);
    }

    @DisplayName("Test subtract method")
    @Test
    void testTenMinusFive(){
        int expected = 5;
        int actual = calculator.subtract(10,5);
        assertEquals(expected,actual);
    }

    @DisplayName("Test multiply method")
    @Test
    void testEightMultipliedWithFive(){
        int expected = 40;
        int actual = calculator.multiply(8,5);
        assertEquals(expected,actual);
    }

    @DisplayName("Test divide method")
    @Test
    void testTenDividedWith2(){
        int expected = 5;
        int actual = calculator.divide(10,2);
        assertEquals(expected,actual);
    }

    @DisplayName("Test divide by zero throws exception")
    @Test
    void testDivideByZero() {
        assertThrows(IllegalArgumentException.class, () -> calculator.divide(10, 0));
    }

    @DisplayName("Test numbers can sum as Strings")
    @Test
    void testSumStrings(){
        int expected = 6;
        int actual = calculator.add("1,2,3");
    }

    @DisplayName("Test null string returns zero")
    @Test
    void testNull(){
        int expected = 0;
        int actual = calculator.add(null);
        assertEquals(expected,actual);
    }

    @DisplayName("Test null string returns zero")
    @Test
    void testEmptyString(){
        int expected = 0;
        int actual = calculator.add("");
        assertEquals(expected,actual);
    }

    @DisplayName("Test string doesn't crash calculator")
    @Test
    void testCalculatorWithString(){
        int expected = 3;
        int actual = calculator.add("1,2,hello");
        assertEquals(expected,actual);
    }

    @DisplayName("Test numbers with whitespace")
    @Test
    void testNumbersWithWhitespace(){
        int expected = 6;
        int actual = calculator.add(" 1 , 2 , 3 ");
        assertEquals(expected, actual);
    }


}