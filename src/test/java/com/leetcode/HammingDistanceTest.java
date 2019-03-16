package com.leetcode;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Test cases for HammingDistance problem.
 *
 * @author Vasyl Grygoryev (aka Basil Gregory)
 *         created on 3/17/19
 */
public class HammingDistanceTest {

    private HammingDistance hammingDistance;

    @Before
    public void setup() {
        hammingDistance = new HammingDistance();
    }

    @Test
    public void leetcodeExample() throws Exception {
        int x = 2;
        int y = 4;
        int expected = 2;

        assertEquals(expected, hammingDistance.hammingDistance(x, y));
    }

    @Test
    public void additionalExample() throws Exception {
        int x = 3;
        int y = 1;
        int expected = 1;

        assertEquals(expected, hammingDistance.hammingDistance(x, y));
    }
}