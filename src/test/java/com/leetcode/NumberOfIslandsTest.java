package com.leetcode;

import org.junit.*;

import static org.junit.Assert.*;

/**
 * Test cases for NumberOfIslands problem.
 *
 * @author Vasyl Grygoryev (aka Basil Gregory)
 *         created on 3/17/19
 */
public class NumberOfIslandsTest {

    private NumberOfIslands numberOfIslands;

    @Before
    public void setup() {
        numberOfIslands = new NumberOfIslands();
    }

    @Test
    public void leetcodeExample1() throws Exception {
        char[][] grid = {{'1','1','1','1','0'},
                {'1','1','0','1','0'},
                {'1','1','0','0','0'},
                {'0','0','0','0','0'}};
        int expected = 1;

        assertEquals(expected, numberOfIslands.numIslands(grid));
    }

    @Test
    public void leetcodeExample2() throws Exception {
        char[][] grid = {{'1','1','0','0','0'},
                {'1','1','0','0','0'},
                {'0','0','1','0','0'},
                {'0','0','0','1','1'}};
        int expected = 3;

        assertEquals(expected, numberOfIslands.numIslands(grid));
    }

}