package com.jeff.research.math;

public class Fabonacci {
    private static final int start_0 = 0;
    private static final int start_1 = 1;

    public static int getNumberByIndex(int index) {
        if (0 > index) {
            throw new IllegalArgumentException("Input index must be non-negative integer number, but it is: "+ index);
        } else {
            return findFabonacciNumberByIndex(index);
        }
    }

    public static int getSumByIndex(int index) {
        if (0 > index) {
            throw new IllegalArgumentException("Input index must be non-negative integer number, but it is: "+ index);
        } else {
            return findFabonacciSumByIndex(index);
        }
    }

    private static int findFabonacciSumByIndex(int index) {
        int prev_2 = start_0;
        int prev_1 = start_1;
        int t = 0;
        int sum = prev_1 + prev_2;
        if (0 == index) {
            return prev_2;
        } else if (1 == index) {
            return prev_1;
        } else {
            for (int i = 2; i<=index ; i++) {
                t = prev_1 + prev_2;
                sum = sum + t;
                prev_2 = prev_1;
                prev_1 = t;
            }
        }
        return sum;
    }

    private static int findFabonacciNumberByIndex(int index) {
        int prev_2 = start_0;
        int prev_1 = start_1;
        int result = 0;
        if (0 == index) {
            return prev_2;
        } else if (1 == index) {
            return prev_1;
        } else {
            for (int i = 2; i<=index ; i++) {
                result = prev_1 + prev_2;
                prev_2 = prev_1;
                prev_1 = result;
            }
        }
        return result;
    }
}
