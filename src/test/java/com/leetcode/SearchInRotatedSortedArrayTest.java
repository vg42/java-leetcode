package com.leetcode;

import org.junit.*;

import static org.junit.Assert.*;

/**
 * Test cases for SearchInRotatedSortedArray problem.
 *
 * @author Vasyl Grygoryev (aka Basil Gregory)
 *         created on 3/24/19
 */
public class SearchInRotatedSortedArrayTest {

    private SearchInRotatedSortedArray searchInRotatedSortedArray;

    @Before
    public void setup() {
        searchInRotatedSortedArray = new SearchInRotatedSortedArray();
    }

    @Test
    public void leetcodeExample1() throws Exception {
        int[] nums = {4,5,6,7,0,1,2};
        int target = 0;
        int expected = 4;

        assertEquals(expected, searchInRotatedSortedArray.search(nums, target));
    }

    @Test
    public void leetcodeExample2() throws Exception {
        int[] nums = {4,5,6,7,0,1,2};
        int target = 3;
        int expected = -1;

        assertEquals(expected, searchInRotatedSortedArray.search(nums, target));
    }

    @Test
    public void leetcodeExample3() throws Exception {
        int[] nums = {1,3,5};
        int target = 3;
        int expected = 1;

        assertEquals(expected, searchInRotatedSortedArray.search(nums, target));
    }
}