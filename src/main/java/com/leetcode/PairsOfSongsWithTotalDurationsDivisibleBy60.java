package com.leetcode;

/**
 * Solution for PairsOfSongsWithTotalDurationsDivisibleBy60 problem.
 * https://leetcode.com/problems/pairs-of-songs-with-total-durations-divisible-by-60/
 *
 * @author Vasyl Grygoryev (aka Basil Gregory)
 *         created on 3/17/19
 */
public class PairsOfSongsWithTotalDurationsDivisibleBy60 {

    public int numPairsDivisibleBy60(int[] time) {
        int[] map = new int[60];

        for (int t: time) {
            map[t % 60]++;
        }

        int result = 0;
        for (int i = 1; i < 30; i++) {
            result += map[i] * map[60 - i];
        }

        result += map[0] * (map[0] - 1) / 2;
        result += map[30] * (map[30] - 1) / 2;

        return result;
    }


}
