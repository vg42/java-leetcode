package com.leetcode;

import org.junit.*;

import static org.junit.Assert.*;

/**
 * Test cases for IntegerToEnglishWords problem.
 *
 * @author Vasyl Grygoryev (aka Basil Gregory)
 *         created on 3/18/19
 */
public class IntegerToEnglishWordsTest {

    private IntegerToEnglishWords integerToEnglishWords;

    @Before
    public void setup() {
        integerToEnglishWords = new IntegerToEnglishWords();
    }

    @Test
    public void leetcodeExample1() throws Exception {
        int n = 123;
        String expected = "One Hundred Twenty Three";

        assertEquals(expected, integerToEnglishWords.numberToWords(n));
    }

    @Test
    public void leetcodeExample2() throws Exception {
        int n = 12345;
        String expected = "Twelve Thousand Three Hundred Forty Five";

        assertEquals(expected, integerToEnglishWords.numberToWords(n));
    }

    @Test
    public void leetcodeExample3() throws Exception {
        int n = 1234567;
        String expected = "One Million Two Hundred Thirty Four Thousand Five Hundred Sixty Seven";

        assertEquals(expected, integerToEnglishWords.numberToWords(n));
    }

    @Test
    public void leetcodeExample4() throws Exception {
        int n = 1234567891;
        String expected = "One Billion Two Hundred Thirty Four Million Five Hundred Sixty Seven Thousand Eight Hundred Ninety One";

        assertEquals(expected, integerToEnglishWords.numberToWords(n));
    }

    @Test
    public void leetcodeExample5() throws Exception {
        int n = 0;
        String expected = "Zero";

        assertEquals(expected, integerToEnglishWords.numberToWords(n));
    }

    @Test
    public void leetcodeExample6() throws Exception {
        int n = 1000000;
        String expected = "One Million";

        assertEquals(expected, integerToEnglishWords.numberToWords(n));
    }

    @Test
    public void leetcodeExample7() throws Exception {
        int n = 1000010;
        String expected = "One Million Ten";

        assertEquals(expected, integerToEnglishWords.numberToWords(n));
    }

}