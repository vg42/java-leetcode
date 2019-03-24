package com.leetcode;

import org.junit.*;

import static org.junit.Assert.*;

/**
 * Test cases for MaximumSizeSubarraySumEqualsK problem.
 *
 * @author Vasyl Grygoryev (aka Basil Gregory)
 *         created on 3/24/19
 */
public class MaximumSizeSubarraySumEqualsKTest {

    private MaximumSizeSubarraySumEqualsK maximumSizeSubarraySumEqualsK;

    @Before
    public void setup() {
        maximumSizeSubarraySumEqualsK = new MaximumSizeSubarraySumEqualsK();
    }

    @Test
    public void leetcodeExample1() throws Exception {
        int[] nums = {1,-1,5,-2,3};
        int k = 3;
        int expected = 4;

        assertEquals(expected, maximumSizeSubarraySumEqualsK.maxSubArrayLen(nums, k));
    }

    @Test
    public void leetcodeExample2() throws Exception {
        int[] nums = {-2,-1,2,1};
        int k = 1;
        int expected = 2;

        assertEquals(expected, maximumSizeSubarraySumEqualsK.maxSubArrayLen(nums, k));
    }

}