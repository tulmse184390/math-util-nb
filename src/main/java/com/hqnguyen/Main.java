package com.hqnguyen;

import com.hqnguyen.mathutil.core.MathUtility;

public class Main {
    public static void main(String[] args) {
        testFactorialGivenRightArg0RUnsWell();
        testFactorialGivenRightArg1RUnsWell();
        testFactorialGivenRightArg5RUnsWell();
        testFactorialGivenWrongArgMinus5ThrowException();
    }

    //list of test case to check code right/wrong - TDD practicing
    // function name have test case's meaning to help dec test thiếu đủ các test case
    public static void testFactorialGivenRightArg0RUnsWell() {
        int n = 0; //given n = 0
        long expectedResult = 1; //hope that 0! = 1
        long actualValue = MathUtility.getFactorial(n); //actual ???
        // compare
        System.out.println("Expected: " + expectedResult + ", Actual: " + actualValue);
        System.out.println("status: " + (expectedResult == actualValue) );
    }

    public static void testFactorialGivenRightArg1RUnsWell() {
        int n = 1; //given n = 1
        long expectedResult = 1; //hope that 1! = 1
        long actualValue = MathUtility.getFactorial(n); //actual ???
        // compare
        System.out.println("Expected: " + expectedResult + ", Actual: " + actualValue);
        System.out.println("status: " + (expectedResult == actualValue) );
    }

    public static void testFactorialGivenRightArg5RUnsWell() {
        int n = 5; //given n = 5
        long expectedResult = 120; //hope that 5! = 120
        long actualValue = MathUtility.getFactorial(n); //actual ???
        // compare
        System.out.println("Expected: " + expectedResult + ", Actual: " + actualValue);
        System.out.println("status: " + (expectedResult == actualValue) );
    }

    // test giai thừa với âm 2, hy vọng trả về 1 ngoại lệ
    public static void testFactorialGivenWrongArgMinus5ThrowException() {
        MathUtility.getFactorial(-2);
    }
}