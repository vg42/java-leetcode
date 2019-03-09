package com.leetcode;

/**
 * Solution for MedianOfTwoSortedArrays problem.
 *
 * @author Vasyl Grygoryev (aka Basil Gregory)
 *         created on 3/9/19
 */
public class MedianOfTwoSortedArrays {

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        // i - number of values from nums1 which are on the left side of median in merged array.
        // i could be 0, 1, ..., l1 where l1 = nums1.length
        // example:
        // 2 4 5
        // 1 3 8
        // merged array = [1, 2, 3], 4, 5, 8
        // median = (3 + 4) / 2 = 3.5
        // [2] [4 5] - 1 element in left sub-array (i = 1)
        // [1 3] [8] - 2 elements in left sub-array (j = 2)

        // The first array should not be longer than the second one.
        if (nums1.length > nums2.length) {
            int[] temp = nums1;
            nums1 = nums2;
            nums2 = temp;
        }
        int l1 = nums1.length;
        int l2 = nums2.length;
        int l = l1 + l2;

        int left = 0, right = nums1.length;
        while (left <= right) {
            int i = (left + right) / 2;
            int j = (l + 1) / 2 - i;

            if (i < right && nums1[i] < nums2[j - 1]) {
                left = i + 1;
            }
            else if (i > left && nums1[i - 1] > nums2[j]) {
                right = i - 1;
            }
            else {
                int maxLeft;
                if (i == 0) {
                    maxLeft = nums2[j - 1];
                }
                else if (j == 0) {
                    maxLeft = nums1[i - 1];
                }
                else {
                    maxLeft = Math.max(nums1[i - 1], nums2[j - 1]);
                }
                if (l % 2 == 1) {
                    return maxLeft;
                }

                int minRight;
                if (i == l1) {
                    minRight = nums2[j];
                }
                else if (j == l2) {
                    minRight = nums1[i];
                }
                else {
                    minRight = Math.min(nums1[i], nums2[j]);
                }

                return (maxLeft + minRight) / 2.0;
            }

        }

        return 0.0;
    }

}
