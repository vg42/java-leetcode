package com.leetcode;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Test cases for RegularExpressionMatching problem.
 *
 * @author Vasyl Grygoryev (aka Basil Gregory)
 *         created on 3/13/19
 */
public class RegularExpressionMatchingTest {

    private RegularExpressionMatching regularExpressionMatching;

    @Before
    public void setup() {
        regularExpressionMatching = new RegularExpressionMatching();
    }

    @Test
    public void leetcodeExample1() throws Exception {
        String s = "aa";
        String p = "a";

        assertEquals(false, regularExpressionMatching.isMatch(s, p));
    }

    @Test
    public void leetcodeExample2() throws Exception {
        String s = "aab";
        String p = "c*a*b";

        assertEquals(true, regularExpressionMatching.isMatch(s, p));
    }

    @Test
    public void leetcodeExample3() throws Exception {
        String s = "mississippi";
        String p = "mis*is*p*.";

        assertEquals(false, regularExpressionMatching.isMatch(s, p));
    }

    @Test
    public void leetcodeExample4() throws Exception {
        String s = "aa";
        String p = "a*";

        assertEquals(true, regularExpressionMatching.isMatch(s, p));
    }

    @Test
    public void leetcodeExample5() throws Exception {
        String s = "aa";
        String p = ".*";

        assertEquals(true, regularExpressionMatching.isMatch(s, p));
    }

    @Test
    public void additionalTest() throws Exception {
        String s = "aaaaaaaaaaabaa";
        String p = ".*ba.";

        assertEquals(true, regularExpressionMatching.isMatch(s, p));
    }

}