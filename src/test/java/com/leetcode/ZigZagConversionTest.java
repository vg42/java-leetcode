package com.leetcode;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Test cases for ZigZagConversionTest problem.
 *
 * @author Vasyl Grygoryev (aka Basil Gregory)
 *         created on 3/10/19
 */
public class ZigZagConversionTest {

    private ZigZagConversion zigZagConversion;

    @Before
    public void setup() {
        zigZagConversion = new ZigZagConversion();
    }

    @Test
    public void leetcodeExample1() throws Exception {
        String s = "PAYPALISHIRING";
        int n = 3;
        String expected = "PAHNAPLSIIGYIR";

        assertEquals(expected, zigZagConversion.convert(s, n));
    }

    @Test
    public void leetcodeExample2() throws Exception {
        String s = "PAYPALISHIRING";
        int n = 4;
        String expected = "PINALSIGYAHRPI";

        assertEquals(expected, zigZagConversion.convert(s, n));
    }

    @Test
    public void emptyString() throws Exception {
        String s = "";
        int n = 4;
        String expected = "";

        assertEquals(expected, zigZagConversion.convert(s, n));
    }

    @Test
    public void oneRow() throws Exception {
        String s = "abc";
        int n = 1;
        String expected = "abc";

        assertEquals(expected, zigZagConversion.convert(s, n));
    }

    @Test
    public void twoRows() throws Exception {
        String s = "01234";
        int n = 2;
        // 024
        // 13
        String expected = "02413";

        assertEquals(expected, zigZagConversion.convert(s, n));
    }

    @Test
    public void additionalCase() throws Exception {
        String s = "0123456789qwertyuiopasdfghjklzxcvbnm";
        int n = 6;
        // 0    q    a    x
        // 1   9w   ps   zc
        // 2  8 e  o d  l v
        // 3 7  r i  f k  b
        // 46   tu   gj   n
        // 5    y    h    m

        String expected = "0qax19wpszc28eodlv37rifkb46tugjn5yhm";

        assertEquals(expected, zigZagConversion.convert(s, n));
    }

}