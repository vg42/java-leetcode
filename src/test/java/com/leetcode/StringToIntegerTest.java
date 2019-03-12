package com.leetcode;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Test cases for StringToIntegerTest problem.
 *
 * @author Vasyl Grygoryev (aka Basil Gregory)
 *         created on 3/12/19
 */
public class StringToIntegerTest {

    private StringToInteger stringToInteger;

    @Before
    public void setup() {
        stringToInteger = new StringToInteger();
    }

    @Test
    public void leetcodeExample1() throws Exception {
        String s = "42";
        int expected = 42;

        assertEquals(expected, stringToInteger.myAtoi(s));
    }

    @Test
    public void leetcodeExample2() throws Exception {
        String s = "   -42";
        int expected = -42;

        assertEquals(expected, stringToInteger.myAtoi(s));
    }

    @Test
    public void leetcodeExample3() throws Exception {
        String s = "4193 with words";
        int expected = 4193;

        assertEquals(expected, stringToInteger.myAtoi(s));
    }

    @Test
    public void leetcodeExample4() throws Exception {
        String s = "words and 987";
        int expected = 0;

        assertEquals(expected, stringToInteger.myAtoi(s));
    }

    @Test
    public void leetcodeExample5() throws Exception {
        String s = "-91283472332";
        int expected = -2147483648;

        assertEquals(expected, stringToInteger.myAtoi(s));
    }

    @Test
    public void leetcodeExample6() throws Exception {
        String s = "2147483648";
        int expected = 2147483647;

        assertEquals(expected, stringToInteger.myAtoi(s));
    }

    @Test
    public void leetcodeExample7() throws Exception {
        String s = "9223372036854775808";
        int expected = 2147483647;

        assertEquals(expected, stringToInteger.myAtoi(s));
    }

}