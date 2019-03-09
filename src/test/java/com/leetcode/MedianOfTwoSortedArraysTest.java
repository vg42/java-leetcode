package com.leetcode;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Solution for _ problem.
 * Test cases for problem.
 *
 * @author Vasyl Grygoryev (aka Basil Gregory)
 *         created on 3/9/19
 */
public class MedianOfTwoSortedArraysTest {

    private MedianOfTwoSortedArrays medianOfTwoSortedArrays;

    @Before
    public void setup() {
        medianOfTwoSortedArrays = new MedianOfTwoSortedArrays();
    }

    @Test
    public void leetcodeExample1() throws Exception {
        int[] nums1 = {1, 3};
        int[] nums2 = {2};
        double expected = 2.0;

        assertEquals(expected, medianOfTwoSortedArrays.findMedianSortedArrays(nums1, nums2), 0);
    }

    @Test
    public void leetcodeExample2() throws Exception {
        int[] nums1 = {1, 2};
        int[] nums2 = {3, 4};
        double expected = 2.5;

        assertEquals(expected, medianOfTwoSortedArrays.findMedianSortedArrays(nums1, nums2), 0);
    }

    @Test
    public void oneArrayEmpty() throws Exception {
        int[] nums1 = {};
        int[] nums2 = {3, 4, 5};
        double expected = 4.0;

        assertEquals(expected, medianOfTwoSortedArrays.findMedianSortedArrays(nums1, nums2), 0);
        assertEquals(expected, medianOfTwoSortedArrays.findMedianSortedArrays(nums2, nums1), 0);
    }

    @Test
    public void elementsFromOneArrayBiggerMedian() throws Exception {
        int[] nums1 = {12, 14, 14, 15, 20};
        int[] nums2 = {1, 4, 8, 9, 10};
        double expected = 11.0;

        assertEquals(expected, medianOfTwoSortedArrays.findMedianSortedArrays(nums1, nums2), 0);
        assertEquals(expected, medianOfTwoSortedArrays.findMedianSortedArrays(nums2, nums1), 0);
    }

    @Test
    public void additionalCase() throws Exception {
        int[] nums1 = {1, 2, 6, 9, 10, 15};
        int[] nums2 = {3, 4, 8, 14, 15};
        double expected = 8.0;

        assertEquals(expected, medianOfTwoSortedArrays.findMedianSortedArrays(nums1, nums2), 0);
    }

}