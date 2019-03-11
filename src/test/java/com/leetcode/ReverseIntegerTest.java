package com.leetcode;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Test cases for ReverseIntegerTest problem.
 *
 * @author Vasyl Grygoryev (aka Basil Gregory)
 *         created on 3/11/19
 */
public class ReverseIntegerTest {

    private ReverseInteger reverseInteger;

    @Before
    public void setup() {
        reverseInteger = new ReverseInteger();
    }

    @Test
    public void leetcodeExample1() throws Exception {
        int x = 123;
        int expected = 321;

        assertEquals(expected, reverseInteger.reverse(x));
    }

    @Test
    public void leetcodeExample2() throws Exception {
        int x = -123;
        int expected = -321;

        assertEquals(expected, reverseInteger.reverse(x));
    }

    @Test
    public void leetcodeExample3() throws Exception {
        int x = 120;
        int expected = 21;

        assertEquals(expected, reverseInteger.reverse(x));
    }

    @Test
    public void leetcodeExample4() throws Exception {
        int x = 1534236469;
        int expected = 0;

        assertEquals(expected, reverseInteger.reverse(x));
    }

}