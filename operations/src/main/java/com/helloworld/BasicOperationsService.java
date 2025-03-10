package com.helloworld;

public class BasicOperationsService {

    public BasicOperationsService() {
    }

    public int sum(int arg1, int arg2) {
        return arg1 + arg2;
    }

    public int minus(int arg1, int arg2) {
        return arg1 - arg2;
    }

    public int multiplication(int arg1, int arg2) {
        return arg1 * arg2;
    }

    public int division(int numerator, int denominator) {
        if (denominator == 0) {
            System.out.println("You cannot divide by zero :(");
            return -1;
        }

        return numerator / denominator;
    }
}
