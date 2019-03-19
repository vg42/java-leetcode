package com.leetcode;

import java.util.*;

/**
 * Solution for MeetingRoomsII problem.
 * https://leetcode.com/problems/meeting-rooms-ii/
 *
 * @author Vasyl Grygoryev (aka Basil Gregory)
 *         created on 3/19/19
 */
public class MeetingRoomsII {

    /**
    * Definition for an interval.
    */
    public static class Interval {
        int start;
        int end;
        Interval() { start = 0; end = 0; }
        Interval(int s, int e) { start = s; end = e; }
    }

    public int minMeetingRooms(Interval[] intervals) {
        if (intervals == null || intervals.length == 0) {
            return 0;
        }

        Arrays.sort(intervals, new Comparator<Interval>(){
            @Override
            public int compare(Interval i1, Interval i2) {
                return i1.start - i2.start;
            }
        });

        PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
        for (Interval interval : intervals) {
            if (pq.isEmpty()) {
                pq.add(interval.end);
                continue;
            }

            if (pq.peek() <= interval.start) {
                pq.poll();
            }
            pq.add(interval.end);
        }

        return pq.size();
    }

}
