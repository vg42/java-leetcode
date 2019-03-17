package com.leetcode;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Test cases for ComplementOfBase10Integer problem.
 *
 * @author Vasyl Grygoryev (aka Basil Gregory)
 *         created on 3/17/19
 */
public class ComplementOfBase10IntegerTest {

    private ComplementOfBase10Integer complementOfBase10Integer;

    @Before
    public void setup() {
        complementOfBase10Integer = new ComplementOfBase10Integer();
    }

    @Test
    public void leetcodeExample1() throws Exception {
        int N = 5;
        int expected = 2;

        assertEquals(expected, complementOfBase10Integer.bitwiseComplement(N));
    }

    @Test
    public void leetcodeExample2() throws Exception {
        int N = 7;
        int expected = 0;

        assertEquals(expected, complementOfBase10Integer.bitwiseComplement(N));
    }

    @Test
    public void leetcodeExample3() throws Exception {
        int N = 10;
        int expected = 5;

        assertEquals(expected, complementOfBase10Integer.bitwiseComplement(N));
    }

    @Test
    public void additionalExample1() throws Exception {
        int N = 0;
        int expected = 1;

        assertEquals(expected, complementOfBase10Integer.bitwiseComplement(N));
    }

    @Test
    public void additionalExample2() throws Exception {
        int N = 1;
        int expected = 0;

        assertEquals(expected, complementOfBase10Integer.bitwiseComplement(N));
    }

    @Test
    public void additionalExample3() throws Exception {
        int N = 2;
        int expected = 1;

        assertEquals(expected, complementOfBase10Integer.bitwiseComplement(N));
    }

}