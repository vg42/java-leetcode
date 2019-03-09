package com.leetcode;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Test cases for LongestPalindromicSubstring problem.
 *
 * @author Vasyl Grygoryev (aka Basil Gregory)
 *         created on 3/9/19
 */
public class LongestPalindromicSubstringTest {

    private LongestPalindromicSubstring longestPalindromicSubstring;

    @Before
    public void setup() {
        longestPalindromicSubstring = new LongestPalindromicSubstring();
    }

    @Test
    public void leetcodeExample1() throws Exception {
        String s = "babad";
        String expected = "bab";

        assertEquals(expected, longestPalindromicSubstring.longestPalindrome(s));
    }

    @Test
    public void leetcodeExample2() throws Exception {
        String s = "cbbd";
        String expected = "bb";

        assertEquals(expected, longestPalindromicSubstring.longestPalindrome(s));
    }

    @Test
    public void emptyString() throws Exception {
        String s = "";
        String expected = "";

        assertEquals(expected, longestPalindromicSubstring.longestPalindrome(s));
    }

    @Test
    public void oneCharPalindrom() throws Exception {
        String s = "casdfgh";
        String expected = "c";

        assertEquals(expected, longestPalindromicSubstring.longestPalindrome(s));
    }

    @Test
    public void palindrom() throws Exception {
        String s = "12345654321";

        assertEquals(s, longestPalindromicSubstring.longestPalindrome(s));
    }

    @Test
    public void palindrom2() throws Exception {
        String s = "aaaaaaaaaaaaaa";

        assertEquals(s, longestPalindromicSubstring.longestPalindrome(s));
    }
}