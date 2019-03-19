package com.leetcode;

import org.junit.*;

import static org.junit.Assert.*;

/**
 * Test cases for BestTimeToBuyAndSellStock problem.
 *
 * @author Vasyl Grygoryev (aka Basil Gregory)
 *         created on 3/19/19
 */
public class BestTimeToBuyAndSellStockTest {

    private BestTimeToBuyAndSellStock bestTimeToBuyAndSellStock;

    @Before
    public void setup() {
        bestTimeToBuyAndSellStock = new BestTimeToBuyAndSellStock();
    }

    @Test
    public void leetcodeExemple1() throws Exception {
        int[] prices = {7,1,5,3,6,4};
        int expected = 5;

        assertEquals(expected, bestTimeToBuyAndSellStock.maxProfit(prices));
    }

    @Test
    public void leetcodeExemple2() throws Exception {
        int[] prices = {7,6,4,3,1};
        int expected = 0;

        assertEquals(expected, bestTimeToBuyAndSellStock.maxProfit(prices));
    }

}