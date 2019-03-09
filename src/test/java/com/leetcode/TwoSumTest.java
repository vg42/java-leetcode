package com.leetcode;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Test cases for TwoSum problem.
 *
 * @author Vasyl Grygoryev (aka Basil Gregory)
 *         created on 3/9/19
 */
public class TwoSumTest {

    private TwoSum twoSum;

    @Before
    public void setup() {
        twoSum = new TwoSum();
    }

    @Test
    public void leetcodeExample() throws Exception {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] expected = {0, 1};

        assertArrayEquals(expected, twoSum.twoSum(nums, target));
    }

    @Test
    public void emptyArray() throws Exception {
        int[] nums = {};
        int target = 9;

        assertArrayEquals(null, twoSum.twoSum(nums, target));
    }

    @Test
    public void oneElementArray() throws Exception {
        int[] nums = {9};
        int target = 9;

        assertArrayEquals(null, twoSum.twoSum(nums, target));
    }

    @Test
    public void notSortedArray() throws Exception {
        int[] nums = {43, 108, 7, 2, 15, 13};
        int target = 20;
        int[] expected = {2, 5};

        assertArrayEquals(expected, twoSum.twoSum(nums, target));
    }

}
