package pro.sky.skyprospringhomework12.service;


import org.assertj.core.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.springframework.boot.SpringApplicationShutdownHandlers;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static pro.sky.skyprospringhomework12.service.Constants.*;

public class CalculatorServiceParamTest {
    private CalculatorService calculatorService = new CalculatorService();

    @ParameterizedTest
    @MethodSource("provideCalculatorParams")
    public void shouldSumCorrectly(double a, double b) {
        double result = (double) calculatorService.sum(a, b);
        assertEquals(a + b, result);
    }

    @ParameterizedTest
    @MethodSource("provideCalculatorParams")
    public void shouldMinusCorrectly(double a, double b) {
        double result = (double) calculatorService.minus(a, b);
        assertEquals(a - b, result);
    }

    @ParameterizedTest
    @MethodSource("provideCalculatorParams")
    public void shouldMultiplyCorrectly(double a, double b) {
        double result = (double) calculatorService.multiply(a, b);
        assertEquals(a * b, result);
    }

    @ParameterizedTest
    @MethodSource("provideCalculatorParams")
    public void shouldDividedCorrectly(double a, double b) {
        double result = (double) calculatorService.divide(a, b);
        assertEquals(a / b, result);
    }

    private static Stream<Arguments> provideCalculatorParams() {
        return Stream.of(
                Arguments.of(ONE, TWO),
                Arguments.of(TWO, TWO),
                Arguments.of(TWO, THREE),
                Arguments.of(ZERO, THREE)
        );
    }
}

