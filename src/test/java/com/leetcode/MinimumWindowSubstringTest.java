package com.leetcode;

import org.junit.*;

import static org.junit.Assert.*;

/**
 * Test cases for MinimumWindowSubstring problem.
 *
 * @author Vasyl Grygoryev (aka Basil Gregory)
 *         created on 3/24/19
 */
public class MinimumWindowSubstringTest {

    private MinimumWindowSubstring minimumWindowSubstring;

    @Before
    public void setup() {
        minimumWindowSubstring = new MinimumWindowSubstring();
    }

    @Test
    public void leetcodeExample() throws Exception {
        String s = "ADOBECODEBANC";
        String t = "ABC";
        String expected = "BANC";

        assertEquals(expected, minimumWindowSubstring.minWindow(s, t));
    }

    @Test
    public void additionalExample1() throws Exception {
        String s = "abdfabaabrgcdfeav";
        String t = "abca";
        String expected = "aabrgc";

        assertEquals(expected, minimumWindowSubstring.minWindow(s, t));
    }

    @Test
    public void additionalExample2() throws Exception {
        String s = "abdfabaabrgcdfeav";
        String t = "abcav";
        String expected = "abrgcdfeav";

        assertEquals(expected, minimumWindowSubstring.minWindow(s, t));
    }

}