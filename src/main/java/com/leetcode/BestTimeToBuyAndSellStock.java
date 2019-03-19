package com.leetcode;

/**
 * Solution for BestTimeToBuyAndSellStock problem.
 * https://leetcode.com/problems/best-time-to-buy-and-sell-stock/
 *
 * @author Vasyl Grygoryev (aka Basil Gregory)
 *         created on 3/19/19
 */
public class BestTimeToBuyAndSellStock {

    public int maxProfit(int[] prices) {
        if (prices == null || prices.length < 2) {
            return 0;
        }

        int min = prices[0], profit = 0;
        for (int price : prices) {
            if (min > price) {
                min = price;
            }
            if (profit < price - min) {
                profit = price - min;
            }
        }

        return profit;
    }

}
