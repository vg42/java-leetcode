package com.leetcode;

import org.junit.*;

import static org.junit.Assert.*;

/**
 * Test cases for MergeSortedArray problem.
 *
 * @author Vasyl Grygoryev (aka Basil Gregory)
 *         created on 3/19/19
 */
public class MergeSortedArrayTest {

    private MergeSortedArray mergeSortedArray;

    @Before
    public void setup() {
        mergeSortedArray = new MergeSortedArray();
    }

    @Test
    public void leetcodeExample() throws Exception {
        int[] nums1 = {1,2,3,0,0,0};
        int m = 3;
        int[] nums2 = {2,5,6};
        int n = 3;
        int[] expected = {1,2,2,3,5,6};
        mergeSortedArray.merge(nums1, m, nums2, n);

        assertArrayEquals(expected, nums1);
    }

    @Test
    public void additionalExample() throws Exception {
        int[] nums1 = {1,6,9,11,0,0,0};
        int m = 4;
        int[] nums2 = {2,7,10};
        int n = 3;
        int[] expected = {1,2,6,7,9,10,11};
        mergeSortedArray.merge(nums1, m, nums2, n);

        assertArrayEquals(expected, nums1);
    }

}