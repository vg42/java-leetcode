package com.leetcode;

/**
 * Solution for HammingDistance problem.
 * https://leetcode.com/problems/hamming-distance/
 *
 * @author Vasyl Grygoryev (aka Basil Gregory)
 *         created on 3/17/19
 */
public class HammingDistance {

    public int hammingDistance(int x, int y) {
        int xor = x ^ y;
        int result = 0;

        while (xor != 0) {
            result += xor & 1;
            xor >>= 1;
        }

        return result;
    }

}
