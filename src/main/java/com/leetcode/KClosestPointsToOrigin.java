package com.leetcode;

import java.util.*;

/**
 * Solution for KClosestPointsToOrigin problem.
 * https://leetcode.com/problems/k-closest-points-to-origin/
 *
 * @author Vasyl Grygoryev (aka Basil Gregory)
 *         created on 3/23/19
 */
public class KClosestPointsToOrigin {

    private Random rand = new Random();
    private int[][] points;

    public int[][] kClosest(int[][] points, int K) {
        this.points = points;
        quickSelect(0, points.length - 1, K);

        return Arrays.copyOfRange(points, 0, K);
    }

    private void quickSelect(int left, int right, int k) {
        if (left == right)
            return;

        int pivot = rand.nextInt(right - left) + left;
        pivot = partition(left, right, pivot);

        if (k < pivot) {
            quickSelect(left, pivot - 1, k);
        }
        else if (k > pivot) {
            quickSelect(pivot + 1, right, k);
        }
    }

    private int partition(int left, int right, int pivot) {
        double pivotValue = distance(pivot);
        swap(pivot, right);
        int storeIndex = left;
        for (int i = left; i < right; i++)
            if (distance(i) < pivotValue)
                swap(i, storeIndex++);
        swap(right, storeIndex);

        return storeIndex;
    }

    private void swap(int i, int j) {
        int[] temp = points[i];
        points[i] = points[j];
        points[j] = temp;
    }

    private double distance(int i) {
        double dist = 0.0;
        for (int el : points[i])
            dist += el * el;

        return dist;
    }

}
