package com.leetcode;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Test cases for ProductOfArrayExceptSelf problem.
 *
 * @author Vasyl Grygoryev (aka Basil Gregory)
 *         created on 3/16/19
 */
public class ProductOfArrayExceptSelfTest {

    private ProductOfArrayExceptSelf productOfArrayExceptSelf;

    @Before
    public void setup() {
        productOfArrayExceptSelf = new ProductOfArrayExceptSelf();
    }

    @Test
    public void leetcodeExample() throws Exception {
        int[] nums = {1,2,3,4};
        int[] expected = {24,12,8,6};

        assertArrayEquals(expected, productOfArrayExceptSelf.productExceptSelf(nums));
    }

    @Test
    public void additionalExample() throws Exception {
        int[] nums = {2,1,6,7,3};
        int[] expected = {126,252,42,36,84};

        assertArrayEquals(expected, productOfArrayExceptSelf.productExceptSelf(nums));
    }

}