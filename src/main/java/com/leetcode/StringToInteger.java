package com.leetcode;

/**
 * Solution for StringToInteger problem.
 * https://leetcode.com/problems/string-to-integer-atoi/
 *
 * @author Vasyl Grygoryev (aka Basil Gregory)
 *         created on 3/12/19
 */
public class StringToInteger {

    public int myAtoi(String str) {
        if (str == null || str.length() == 0) {
            return 0;
        }

        long result = 0;
        int sign = 1;
        int i = 0;
        while (i < str.length() && str.charAt(i) == ' ') {
            i++;
        }

        if (i < str.length() && (str.charAt(i) == '-' || str.charAt(i) == '+')) {
            sign = str.charAt(i++) == '-' ? -1 : 1;
        }

        while (i < str.length() && str.charAt(i) >= '0' && str.charAt(i) <= '9') {
            result = result * 10 + sign * (str.charAt(i++) - '0');
            if (result > Integer.MAX_VALUE) {
                return Integer.MAX_VALUE;
            }
            else if (result < Integer.MIN_VALUE) {
                return Integer.MIN_VALUE;
            }
        }

        return (int)result;
    }

}
