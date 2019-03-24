package com.leetcode;

/**
 * Solution for SearchInRotatedSortedArray problem.
 * https://leetcode.com/problems/search-in-rotated-sorted-array/
 *
 * @author Vasyl Grygoryev (aka Basil Gregory)
 *         created on 3/24/19
 */
public class SearchInRotatedSortedArray {

    public int search(int[] nums, int target) {
        return searchRoated(nums, target, 0, nums.length - 1);
    }

    private int searchRoated(int[] nums, int target, int start, int end) {
        if (start > end)
            return -1;

        if (start == end)
            return nums[start] == target ? start : -1;

        int mid = (start + end) / 2;

        int ss, se, rs, re;

        if (nums[start] <= nums[mid]) {
            ss = start;
            se = mid;
            rs = mid + 1;
            re = end;
        }
        else {
            rs = start;
            re = mid;
            ss = mid + 1;
            se = end;
        }

        int result = searchSorted(nums, target, ss, se);
        if (result != -1)
            return result;

        return searchRoated(nums, target, rs, re);
    }

    private int searchSorted(int[] nums, int target, int start, int end) {
        if (start > end || target < nums[start] || target > nums[end])
            return -1;

        while (start <= end) {
            int mid = (start + end) / 2;
            if (target == nums[mid])
                return mid;
            else if (target > nums[mid])
                start = mid +1;
            else if (target < nums[mid])
                end = mid - 1;
        }

        return -1;
    }

}
