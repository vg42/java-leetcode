package com.leetcode;

/**
 * Solution for ProductOfArrayExceptSelf problem.
 * https://leetcode.com/problems/product-of-array-except-self/
 *
 * @author Vasyl Grygoryev (aka Basil Gregory)
 *         created on 3/16/19
 */
public class ProductOfArrayExceptSelf {

    public int[] productExceptSelf(int[] nums) {
        int[] result = new int[nums.length];
        int product = 1;

        for (int i = 0; i < nums.length; i++) {
            result[i] = product;
            product *= nums[i];
        }

        product = 1;
        for (int i = nums.length - 1; i >= 0; i--) {
            result[i] *= product;
            product *= nums[i];
        }

        return result;
    }

}