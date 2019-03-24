package com.leetcode;

import java.util.*;

/**
 * Solution for MaximumSizeSubarraySumEqualsK problem.
 * https://leetcode.com/problems/maximum-size-subarray-sum-equals-k/
 *
 * @author Vasyl Grygoryev (aka Basil Gregory)
 *         created on 3/24/19
 */
public class MaximumSizeSubarraySumEqualsK {

    public int maxSubArrayLen(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int maxL = 0;
        int sum=0;

        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];

            if (sum == k)
                maxL = Math.max(maxL, i+1);

            int diff = sum - k;
            if (map.containsKey(diff))
                maxL = Math.max(maxL, i - map.get(diff));

            if (!map.containsKey(sum))
                map.put(sum, i);
        }

        return maxL;
    }

}
