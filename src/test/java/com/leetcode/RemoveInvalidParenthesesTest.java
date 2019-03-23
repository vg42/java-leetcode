package com.leetcode;

import java.util.*;
import org.junit.*;

import static org.junit.Assert.*;

/**
 * Solution for RemoveInvalidParentheses problem.
 *
 * @author Vasyl Grygoryev (aka Basil Gregory)
 *         created on 3/23/19
 */
public class RemoveInvalidParenthesesTest {

    private RemoveInvalidParentheses removeInvalidParentheses;

    @Before
    public void setup() {
        removeInvalidParentheses = new RemoveInvalidParentheses();
    }

    private String[] removeAndConvert(String s) {
        List<String> list = removeInvalidParentheses.removeInvalidParentheses(s);
        String[] result = new String[list.size()];
        result = list.toArray(result);

        return result;
    }

    @Test
    public void leetcodeExample1() throws Exception {
        String s = "()())()";
        String[] expected = {"(())()", "()()()"};

        assertArrayEquals(expected, removeAndConvert(s));
    }

    @Test
    public void leetcodeExample2() throws Exception {
        String s = "(a)())()";
        String[] expected = {"(a())()", "(a)()()"};

        assertArrayEquals(expected, removeAndConvert(s));
    }

    @Test
    public void leetcodeExample3() throws Exception {
        String s = ")(";
        String[] expected = {""};

        assertArrayEquals(expected, removeAndConvert(s));
    }

    @Test
    public void additionalExample() throws Exception {
        String s = "()()())))(";
        String[] expected = {"((()))", "(()())","()(())","()()()"};

        assertArrayEquals(expected, removeAndConvert(s));
    }

}