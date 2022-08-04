package com.conbnk;



public class GlobalExceptionHandalling {

    public static void main(String[] args) {

        Handler globalExceptionHandler = new Handler();
        Thread.setDefaultUncaughtExceptionHandler(globalExceptionHandler);
        new GlobalExceptionHandalling().performArithmeticOperation(10, 0);
    }

    public int performArithmeticOperation(int num1, int num2) {
        return num1/num2;
    }
}
