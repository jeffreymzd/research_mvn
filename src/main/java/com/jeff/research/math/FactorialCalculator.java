package com.jeff.research.math;

public class FactorialCalculator {
    public static int factorial(int input) {
        if (input == 0 || input == 1) {
            return 1;
        } else {
            return input * factorial(--input);
        }
    }
}
