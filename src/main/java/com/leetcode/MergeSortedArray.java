package com.leetcode;

/**
 * Solution for MergeSortedArray problem.
 * https://leetcode.com/problems/merge-sorted-array/
 *
 * @author Vasyl Grygoryev (aka Basil Gregory)
 *         created on 3/19/19
 */
public class MergeSortedArray {

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int k = m + n - 1;
        m--;
        n--;

        while (m >= 0 && n >= 0) {
            if (nums1[m] < nums2[n]) {
                nums1[k--] = nums2[n--];
            }
            else {
                nums1[k--] = nums1[m--];
            }
        }

        while (m >= 0) {
            nums1[k--] = nums1[m--];
        }

        while (n >= 0) {
            nums1[k--] = nums2[n--];
        }
    }

}
