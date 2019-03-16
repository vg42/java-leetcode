package com.leetcode;

/**
 * Solution for MoveZeroes problem.
 * https://leetcode.com/problems/move-zeroes/
 *
 * @author Vasyl Grygoryev (aka Basil Gregory)
 *         created on 3/16/19
 */
public class MoveZeroes {

    public void moveZeroes(int[] nums) {
        int numZeroes = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                numZeroes++;
                continue;
            }
            if (numZeroes > 0) {
                nums[i - numZeroes] = nums[i];
            }
        }

        for (int i = nums.length - numZeroes; i < nums.length; i++) {
            nums[i] = 0;
        }
    }

}
