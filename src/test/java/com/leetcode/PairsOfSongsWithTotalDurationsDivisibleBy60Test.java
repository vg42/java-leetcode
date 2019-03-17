package com.leetcode;

import org.junit.*;

import static org.junit.Assert.*;

/**
 * Test cases for PairsOfSongsWithTotalDurationsDivisibleBy60 problem.
 *
 * @author Vasyl Grygoryev (aka Basil Gregory)
 *         created on 3/17/19
 */
public class PairsOfSongsWithTotalDurationsDivisibleBy60Test {

    private PairsOfSongsWithTotalDurationsDivisibleBy60 pairsOfSongsWithTotalDurationsDivisibleBy60;

    @Before
    public void setup() {
        pairsOfSongsWithTotalDurationsDivisibleBy60 = new PairsOfSongsWithTotalDurationsDivisibleBy60();
    }

    @Test
    public void leetcodeExample1() throws Exception {
        int[] time = {30,20,150,100,40};
        int expected = 3;

        assertEquals(expected, pairsOfSongsWithTotalDurationsDivisibleBy60.numPairsDivisibleBy60(time));
    }

    @Test
    public void leetcodeExample2() throws Exception {
        int[] time = {60,60,60};
        int expected = 3;

        assertEquals(expected, pairsOfSongsWithTotalDurationsDivisibleBy60.numPairsDivisibleBy60(time));
    }


    @Test
    public void additionalExample1() throws Exception {
        int[] time = {60,10,70,50,40,20,80,120,130};
        int expected = 6;

        assertEquals(expected, pairsOfSongsWithTotalDurationsDivisibleBy60.numPairsDivisibleBy60(time));
    }

    @Test
    public void additionalExample2() throws Exception {
        int[] time = {30,30,30,60,60,60};
        int expected = 6;

        assertEquals(expected, pairsOfSongsWithTotalDurationsDivisibleBy60.numPairsDivisibleBy60(time));
    }

    @Test
    public void additionalExample3() throws Exception {
        int[] time = {15,63,451,213,37,209,343,319};
        int expected = 1;

        assertEquals(expected, pairsOfSongsWithTotalDurationsDivisibleBy60.numPairsDivisibleBy60(time));
    }

}