package com.hqnguyen.mathutil.core;

// khi viết cho company -- com. tên công ty - tên dự án - các code

public class MathUtility {
//    count n! = 1.2.3.4....n
    public static long getFactorial (int n) {

        if (n < 0 || n > 20) {
            // return -1;
            throw new IllegalArgumentException("Invalid n. N must ne between 0 and 20!");
        }

        if (n == 0) {
            return 1; //early return
        }

        // thuật toán con heo đất, nhân dồn, cộng dồng
        long result = 1;
        for (int i = 1; i <= n; i++) {
            result *=i;
        }
        return result;
    }

    // Test case #1
    // Verify getFactorial() with n = 0
    // steps/ procedure
    //    1. Given n with 0
    //    2. call getFactorial(n)

    // expected result: the method will return 1

    // Test case #2
    // Verify getFactorial() with n = 1
    // steps/ procedure
    //    1. Given n with 1
    //    2. call getFactorial(n)

    // expected result: the method will return 1


    // Test case #5
    // Verify getFactorial() with n = 5
    // steps/ procedure
    //    1. Given n with 0
    //    2. call getFactorial(n)

    // expected result: the method will return 120
}
