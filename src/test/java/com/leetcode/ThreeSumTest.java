package com.leetcode;

import java.util.*;
import org.junit.*;

import static org.junit.Assert.*;

/**
 * Test cases for ThreeSum problem.
 *
 * @author Vasyl Grygoryev (aka Basil Gregory)
 *         created on 3/17/19
 */
public class ThreeSumTest {

    private ThreeSum threeSum;

    @Before
    public void setup() {
        threeSum = new ThreeSum();
    }

    @Test
    public void leetcodeExample1() throws Exception {
        int[] nums = {-1, 0, 1, 2, -1, -4};
        List<List<Integer>> list = threeSum.threeSum(nums);
        Integer[][] result = new Integer[list.size()][];
        for (int i = 0; i < list.size(); i++) {
            List<Integer> l = list.get(i);
            result[i] = l.toArray(new Integer[l.size()]);
        }
        Integer[][] expected = {{-1, -1, 2}, {-1, 0, 1}};

        assertArrayEquals(expected, result);
    }

    @Test
    public void leetcodeExample2() throws Exception {
        int[] nums = {0,0,0,0};
        List<List<Integer>> list = threeSum.threeSum(nums);
        Integer[][] result = new Integer[list.size()][];
        for (int i = 0; i < list.size(); i++) {
            List<Integer> l = list.get(i);
            result[i] = l.toArray(new Integer[l.size()]);
        }
        Integer[][] expected = {{0, 0, 0}};

        assertArrayEquals(expected, result);
    }


}