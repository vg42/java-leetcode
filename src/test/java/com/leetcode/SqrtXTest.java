package com.leetcode;

import org.junit.*;

import static org.junit.Assert.*;

/**
 * Solution for _ problem.
 * Test cases for problem.
 *
 * @author Vasyl Grygoryev (aka Basil Gregory)
 *         created on 3/21/19
 */
public class SqrtXTest {

    private SqrtX sqrtX;

    @Before
    public void setup() {
        sqrtX = new SqrtX();
    }

    @Test
    public void leetcodeExample1() throws Exception {
        int x = 4;
        int expected = 2;

        assertEquals(expected, sqrtX.mySqrt(x));
    }

    @Test
    public void leetcodeExample2() throws Exception {
        int x = 8;
        int expected = 2;

        assertEquals(expected, sqrtX.mySqrt(x));
    }

    @Test
    public void leetcodeExample3() throws Exception {
        int x = 2147395599;
        int expected = 46339;

        assertEquals(expected, sqrtX.mySqrt(x));
    }


    @Test
    public void additionalExample() throws Exception {
        for (int x = 0; x < 1000000; x++) {
            assertEquals((int)Math.sqrt(x), sqrtX.mySqrt(x));
        }
    }

}