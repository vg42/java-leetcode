package com.leetcode;

import org.junit.*;

import static org.junit.Assert.*;

/**
 * Test cases for PowXN problem.
 *
 * @author Vasyl Grygoryev (aka Basil Gregory)
 *         created on 3/21/19
 */
public class PowXNTest {

    private PowXN powXN;

    @Before
    public void setup() {
        powXN = new PowXN();
    }

    @Test
    public void leetcodeExample1() {
        double x = 2.00000;
        int n = 10;
        double expected = 1024.00000;

        assertEquals(expected, powXN.myPow(x, n), 0.00001);
    }

    @Test
    public void leetcodeExample2() {
        double x = 2.10000;
        int n = 3;
        double expected = 9.26100;

        assertEquals(expected, powXN.myPow(x, n), 0.00001);
    }

    @Test
    public void leetcodeExample3() {
        double x = 2.00000;
        int n = -2;
        double expected = 0.25000;

        assertEquals(expected, powXN.myPow(x, n), 0.00001);
    }

}