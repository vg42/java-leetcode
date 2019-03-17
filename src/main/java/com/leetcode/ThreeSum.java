package com.leetcode;

import java.util.*;

/**
 * Solution for ThreeSum problem.
 * https://leetcode.com/problems/3sum/
 *
 * @author Vasyl Grygoryev (aka Basil Gregory)
 *         created on 3/17/19
 */
public class ThreeSum {

    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        if (nums == null || nums.length == 0) {
            return result;
        }

        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                break;
            }
            if (i > 0 && nums[i] == nums[i -1]) {
                continue;
            }

            int left = i + 1;
            int right = nums.length - 1;
            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];
                if (sum == 0) {
                    result.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    while (left + 1 < right && nums[left] == nums[left + 1]) {
                        left++;
                    }
                    while (right - 1 > left && nums[right] == nums[right - 1]) {
                        right--;
                    }
                    left++;
                    right--;
                }
                else if (sum > 0) {
                    right--;
                }
                else {
                    left++;
                }
            }
        }

        return result;
    }

}
