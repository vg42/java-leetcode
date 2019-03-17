package com.leetcode;

/**
 * Solution for CapacityToShipPackagesWithinDDays problem.
 * https://leetcode.com/problems/capacity-to-ship-packages-within-d-days/
 *
 * @author Vasyl Grygoryev (aka Basil Gregory)
 *         created on 3/17/19
 */
public class CapacityToShipPackagesWithinDDays {

    public int shipWithinDays(int[] weights, int D) {
        int sum = 0;
        int max = 0;
        for (int w : weights) {
            sum += w;
            max = Math.max(max, w);
        }

        int left = Math.max(sum / D, max);
        int right = sum;
        while (left < right) {
            int mid = (left + right) / 2;
            int days = countShipDays(weights, mid);

            if (days > D) {
                left = mid + 1;
            }
            else {
                right = mid;
            }
        }

        return left;
    }

    public int countShipDays(int[] weights, int shipWeight) {
        int day = 1;
        int sum = 0;

        for (int w : weights) {
            if (sum + w > shipWeight) {
                sum = w;
                day++;
            }
            else {
                sum += w;
            }
        }

        return day;
    }

}
