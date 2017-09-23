package com.jeff.research.math;

import org.junit.Test;

import static org.junit.Assert.*;

public class FabonacciTest {
    @Test
    public void getNumberByIndex() throws Exception {
        assertEquals(1, Fabonacci.getNumberByIndex(2));
    }

    @Test
    public void getSumByIndex() throws Exception {
        assertEquals(2, Fabonacci.getSumByIndex(2));
    }
}