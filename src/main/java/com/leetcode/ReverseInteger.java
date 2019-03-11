package com.leetcode;

/**
 * Solution for ReverseInteger problem.
 * https://leetcode.com/problems/reverse-integer/
 *
 * @author Vasyl Grygoryev (aka Basil Gregory)
 *         created on 3/11/19
 */
public class ReverseInteger {

    public int reverse(int x) {
        int sign = 1;
        if (x < 0) {
            sign = -1;
        }

        long ix = 0;
        x *= sign;
        while (x > 0) {
            ix = ix * 10 + x % 10;
            x /= 10;
        }

        if (ix > Integer.MAX_VALUE) {
            ix = 0;
        }

        return (int) (sign * ix);
    }

}
