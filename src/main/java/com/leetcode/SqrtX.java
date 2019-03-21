package com.leetcode;

/**
 * Solution for SqrtX problem.
 * https://leetcode.com/problems/sqrtx/
 *
 * @author Vasyl Grygoryev (aka Basil Gregory)
 *         created on 3/21/19
 */
public class SqrtX {

    public int mySqrt(int x) {
        if (x == 0) {
            return 0;
        }

        int left = 1;
        int right = x;

        while (left < right) {
            int mid = (left + right) / 2;

            if (mid > x / mid) {
                right = mid - 1;
            }
            else {
                left = mid + 1;
            }
        }

        return (left <= x / left) ? left : left - 1;
    }
}
