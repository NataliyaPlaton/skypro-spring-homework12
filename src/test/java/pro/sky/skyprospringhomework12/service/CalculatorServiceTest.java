package pro.sky.skyprospringhomework12.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import pro.sky.skyprospringhomework12.exception.DivisionByZeroException;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static pro.sky.skyprospringhomework12.service.Constants.*;


class CalculatorServiceTest {
    private final CalculatorService calculatorService = new CalculatorService();

    @Test
    public void shouldReturnTwoWhenSumOneAndOne() {
        double result = (double) calculatorService.sum(ONE, ONE);
        assertEquals(ONE + ONE, result);
    }

    @Test
    public void shouldReturnThreeWhenSumTwoAndOne() {
        double result = (double) calculatorService.sum(TWO, ONE);
        assertEquals(TWO + ONE, result);
    }

    @Test
    public void shouldReturnOneWhenMinusTwoAndOne() {
        double result = (double) calculatorService.minus(TWO, ONE);
        assertEquals(TWO - ONE, result);
    }

    @Test
    public void shouldReturnZeroWhenMinusOneAndOne() {
        double result = (double) calculatorService.minus(ONE, ONE);
        assertEquals(ONE - ONE, result);
    }

    @Test
    public void shouldReturnTwoWhenMultiplyTwoAndOne() {
        double result = (double) calculatorService.multiply(TWO, ONE);
        assertEquals(TWO * ONE, result);
    }

    @Test
    public void shouldReturnThreeWhenMultiplyThreeAndOne() {
        double result = (double) calculatorService.multiply(THREE, ONE);
        assertEquals(THREE * ONE, result);
    }

    @Test
    public void shouldReturnThreeWhenDivideThreeAndOne() {
        double result = (double) calculatorService.divide(THREE, ONE);
        assertEquals(THREE / ONE, result);
    }

    @Test
    public void shouldReturnOneWhenDivideOneAndOne() {
        double result = (double) calculatorService.divide(ONE, ONE);
        assertEquals(ONE / ONE, result);
    }

    @Test
    public void shouldDivisionByZeroExceptionWhenDivideByZero() {
        assertThrows(DivisionByZeroException.class, () -> calculatorService.divide(ONE, ZERO));
    }

}