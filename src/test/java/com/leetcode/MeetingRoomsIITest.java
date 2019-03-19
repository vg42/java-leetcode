package com.leetcode;

import org.junit.*;

import static org.junit.Assert.*;

/**
 * Solution for _ problem.
 * Test cases for problem.
 *
 * @author Vasyl Grygoryev (aka Basil Gregory)
 *         created on 3/19/19
 */
public class MeetingRoomsIITest {

    private MeetingRoomsII meetingRoomsII;

    @Before
    public void setup() {
        meetingRoomsII = new MeetingRoomsII();
    }

    @Test
    public void leetcodeExample1() throws Exception {
        MeetingRoomsII.Interval[] intervals = new MeetingRoomsII.Interval[3];
        intervals[0] = new MeetingRoomsII.Interval(0, 30);
        intervals[1] = new MeetingRoomsII.Interval(5, 10);
        intervals[2] = new MeetingRoomsII.Interval(15, 20);

        assertEquals(2, meetingRoomsII.minMeetingRooms(intervals));
    }

    @Test
    public void leetcodeExample2() throws Exception {
        MeetingRoomsII.Interval[] intervals = new MeetingRoomsII.Interval[2];
        intervals[0] = new MeetingRoomsII.Interval(7, 10);
        intervals[1] = new MeetingRoomsII.Interval(2, 4);

        assertEquals(1, meetingRoomsII.minMeetingRooms(intervals));
    }

    @Test
    public void leetcodeExample3() throws Exception {
        MeetingRoomsII.Interval[] intervals = new MeetingRoomsII.Interval[3];
        intervals[0] = new MeetingRoomsII.Interval(6, 15);
        intervals[1] = new MeetingRoomsII.Interval(13, 20);
        intervals[2] = new MeetingRoomsII.Interval(6, 17);

        assertEquals(3, meetingRoomsII.minMeetingRooms(intervals));
    }

    @Test
    public void leetcodeExample4() throws Exception {
        MeetingRoomsII.Interval[] intervals = new MeetingRoomsII.Interval[2];
        intervals[0] = new MeetingRoomsII.Interval(7, 13);
        intervals[1] = new MeetingRoomsII.Interval(13, 14);

        assertEquals(1, meetingRoomsII.minMeetingRooms(intervals));
    }

}