package com.jeff.research.math;

import java.math.BigInteger;

public class FactorialCalculator {
    public static BigInteger factorial(int input) {
        BigInteger bi = BigInteger.valueOf(new Long(input));
        if (input == 0 || input == 1) {
            return BigInteger.valueOf(1);
        } else {
            return bi.multiply(factorial(input-1));
        }
    }
}
