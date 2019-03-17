package com.leetcode;

/**
 * Solution for ComplementOfBase10Integer problem.
 * https://leetcode.com/problems/complement-of-base-10-integer/
 *
 * @author Vasyl Grygoryev (aka Basil Gregory)
 *         created on 3/17/19
 */
public class ComplementOfBase10Integer {

    public int bitwiseComplement(int N) {
        int power2 = 2;

        while (power2 <= N) {
            power2 <<= 1;
        }
        power2 -= 1;

        return power2 ^ N;
    }

}
