package com.husky;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CalculatorTest {
    private CalculatorService calculatorService;

    @BeforeEach
    public void setup() {
        calculatorService = new CalculatorService();
    }

    @Test
    @DisplayName("Test, addition.")
    public void testAddition() {
        int expectedResult = 5;
        int actualResult = calculatorService.calculate(2, 3, "+");
        assertEquals(expectedResult, actualResult);
    }

    @Test
    @DisplayName("Test, subtraction.")
    public void testSubtraction() {
        int expectedResult = 2;
        int actualResult = calculatorService.calculate(5, 3, "-");
        assertEquals(expectedResult, actualResult);
    }

    @Test
    @DisplayName("Test, multiplication.")
    public void testMultiplication() {
        int expectedResult = 12;
        int actualResult = calculatorService.calculate(4, 3, "*");
        assertEquals(expectedResult, actualResult);
    }

    @Test
    @DisplayName("Test, division.")
    public void testDivision() {
        int expectedResult = 5;
        int actualResult = calculatorService.calculate(10, 2, "/");
        assertEquals(expectedResult, actualResult);
    }

    @Test
    @DisplayName("Test, divide by zero.")
    public void testDivisionByZero() {
        assertThrows(ArithmeticException.class, () ->
                calculatorService.calculate(10, 0, "/")
        );
    }
}
