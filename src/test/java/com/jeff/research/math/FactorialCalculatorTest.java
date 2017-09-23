package com.jeff.research.math;

import org.junit.Test;

import static org.junit.Assert.*;

public class FactorialCalculatorTest {
    @Test
    public void factorial() throws Exception {
        assertEquals(1, FactorialCalculator.factorial(1).longValue());
        assertEquals(2, FactorialCalculator.factorial(2).longValue());
        assertEquals(6, FactorialCalculator.factorial(3).longValue());
        assertEquals(24, FactorialCalculator.factorial(4).longValue());
    }
}