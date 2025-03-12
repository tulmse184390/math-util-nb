package com.hqnguyen.mathutil.core;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MathUtilityTest {

    @Test
    public void testFactorialGivenRightArg9RUnsWell() {
        assertEquals(1 * 2 * 3 * 4 * 5 * 6 * 7 * 8 * 9, MathUtility.getFactorial(9));
    }

    @Test
    public void testFactorialGivenRightArg4RUnsWell() {
        assertEquals(24, MathUtility.getFactorial(4));
    }

    @Test
    public void testFactorialGivenRightArg3RUnsWell() {
        assertEquals(6, MathUtility.getFactorial(3));
    }

    @Test
    public void testFactorialGivenRightArg2RUnsWell() {
        assertEquals(2, MathUtility.getFactorial(2));
    }

    @Test
    public void testFactorialGivenRightArg1RUnsWell() {
        assertEquals(1, MathUtility.getFactorial(1));
    }

    @Test
    public void testFactorialGivenRightArg0RUnsWell() {
        assertEquals(1, MathUtility.getFactorial(0));
    }

    @Test
    public void testFactorialGivenRightArg5RUnsWell() {
        int n = 5; //given n = 5
        long expectedResult = 120; //hope that 5! = 120
        long actualValue = MathUtility.getFactorial(n);

        assertEquals(expectedResult, actualValue);
    }


}