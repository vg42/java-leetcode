package com.leetcode;

/**
 * Solution for PowXN problem.
 * https://leetcode.com/problems/powx-n/
 *
 * @author Vasyl Grygoryev (aka Basil Gregory)
 *         created on 3/21/19
 */
public class PowXN {

    public double myPow(double x, int n) {
        if (n < 0) {
            n = -n;
            x = 1 / x;
        }

        return recursivePow(x, n);
    }

    private double recursivePow(double x, int n) {
        if (n == 0) {
            return 1.0;
        }

        double y = recursivePow(x, n / 2);
        if (n % 2 == 0) {
            return y * y;
        }

        return y * y * x;
    }

}
