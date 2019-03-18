package com.leetcode;

import org.junit.*;

import static org.junit.Assert.*;

/**
 * Test cases for ValidParentheses problem.
 *
 * @author Vasyl Grygoryev (aka Basil Gregory)
 *         created on 3/18/19
 */
public class ValidParenthesesTest {

    private ValidParentheses validParentheses;

    @Before
    public void setup() {
        validParentheses = new ValidParentheses();
    }

    @Test
    public void leetcodeExample1() throws Exception {
        String s = "()";

        assertTrue(validParentheses.isValid(s));
    }

    @Test
    public void leetcodeExample2() throws Exception {
        String s = "()[]{}";

        assertTrue(validParentheses.isValid(s));
    }

    @Test
    public void leetcodeExample3() throws Exception {
        String s = "(]";

        assertFalse(validParentheses.isValid(s));
    }

    @Test
    public void leetcodeExample4() throws Exception {
        String s = "([)]";

        assertFalse(validParentheses.isValid(s));
    }

    @Test
    public void leetcodeExample5() throws Exception {
        String s = "{[]}";

        assertTrue(validParentheses.isValid(s));
    }

    @Test
    public void leetcodeExample6() throws Exception {
        String s = "]";

        assertFalse(validParentheses.isValid(s));
    }

}