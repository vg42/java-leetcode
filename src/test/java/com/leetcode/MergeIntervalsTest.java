package com.leetcode;

import java.util.*;
import org.junit.*;

import static org.junit.Assert.*;

/**
 * Test cases for MergeIntervals problem.
 *
 * @author Vasyl Grygoryev (aka Basil Gregory)
 *         created on 3/18/19
 */
public class MergeIntervalsTest {

    private MergeIntervals mergeIntervals;

    @Before
    public void setup() {
        mergeIntervals = new MergeIntervals();
    }

    @Test
    public void leetcodeExample1() throws Exception {
        List<MergeIntervals.Interval> intervals = new ArrayList<>();
        intervals.add(new MergeIntervals.Interval(1,3));
        intervals.add(new MergeIntervals.Interval(2,6));
        intervals.add(new MergeIntervals.Interval(8,10));
        intervals.add(new MergeIntervals.Interval(15, 18));
        List<MergeIntervals.Interval> result = mergeIntervals.merge(intervals);

        List<MergeIntervals.Interval> expected = new ArrayList<>();
        expected.add(new MergeIntervals.Interval(1,6));
        expected.add(new MergeIntervals.Interval(8,10));
        expected.add(new MergeIntervals.Interval(15, 18));

        assertEquals(expected.size(), result.size());

        for (int i = 0; i < result.size(); i++) {
            MergeIntervals.Interval i1 = result.get(i);
            MergeIntervals.Interval i2 = expected.get(i);

            assertEquals(i1.start, i2.start);
            assertEquals(i1.end, i2.end);
        }
    }

    @Test
    public void leetcodeExample2() throws Exception {
        List<MergeIntervals.Interval> intervals = new ArrayList<>();
        intervals.add(new MergeIntervals.Interval(1,4));
        intervals.add(new MergeIntervals.Interval(4,5));
        List<MergeIntervals.Interval> result = mergeIntervals.merge(intervals);

        List<MergeIntervals.Interval> expected = new ArrayList<>();
        expected.add(new MergeIntervals.Interval(1,5));

        assertEquals(expected.size(), result.size());

        for (int i = 0; i < result.size(); i++) {
            MergeIntervals.Interval i1 = result.get(i);
            MergeIntervals.Interval i2 = expected.get(i);

            assertEquals(i1.start, i2.start);
            assertEquals(i1.end, i2.end);
        }
    }
}