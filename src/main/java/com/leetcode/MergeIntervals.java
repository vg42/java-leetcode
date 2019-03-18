package com.leetcode;

import java.util.*;

/**
 * Solution for MergeIntervals problem.
 * https://leetcode.com/problems/merge-intervals/
 *
 * @author Vasyl Grygoryev (aka Basil Gregory)
 *         created on 3/18/19
 */
public class MergeIntervals {

    /**
     * Definition for an interval.
     */
    public static class Interval {
        int start;
        int end;
        Interval() { start = 0; end = 0; }
        Interval(int s, int e) { start = s; end = e; }
    }

    public List<Interval> merge(List<Interval> intervals) {
        List<Interval> result = new ArrayList<>();

        if (intervals == null || intervals.size() == 0) {
            return result;
        }

        Collections.sort(intervals, new Comparator<Interval>(){
            @Override
            public int compare(Interval i1, Interval i2) {
                return i1.start - i2.start;
            }
        });

        Interval mergedInterval = intervals.get(0);
        for (Interval interval : intervals) {
            if (mergedInterval.end >= interval.start) {
                mergedInterval.end = Math.max(mergedInterval.end, interval.end);
            }
            else {
                result.add(mergedInterval);
                mergedInterval = interval;
            }
        }
        result.add(mergedInterval);

        return result;
    }

}
