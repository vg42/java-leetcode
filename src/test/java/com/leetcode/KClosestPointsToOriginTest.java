package com.leetcode;

import org.junit.*;

import static org.junit.Assert.*;

/**
 * Solution for KClosestPointsToOrigin problem.
 *
 * @author Vasyl Grygoryev (aka Basil Gregory)
 *         created on 3/24/19
 */
public class KClosestPointsToOriginTest {

    private KClosestPointsToOrigin kClosestPointsToOrigin;

    @Before
    public void setup() {
        kClosestPointsToOrigin = new KClosestPointsToOrigin();
    }

    @Test
    public void leetcodeExample1() throws Exception {
        int[][] points = {{1,3},{-2,2}};
        int K = 1;
        int[][] expected = {{-2,2}};

        assertArrayEquals(expected, kClosestPointsToOrigin.kClosest(points, K));
    }

    @Test
    public void leetcodeExample2() throws Exception {
        int[][] points = {{3,3},{5,-1},{-2,4}};
        int K = 2;
        int[][] expected = {{3,3},{-2,4}};

        assertArrayEquals(expected, kClosestPointsToOrigin.kClosest(points, K));
    }

}