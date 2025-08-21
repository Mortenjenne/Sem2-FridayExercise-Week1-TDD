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
    void testTenMinus5(){
        int expected = 5;
        int actual = calculator.subtract(10,5);
        assertEquals(expected,actual);
    }
}