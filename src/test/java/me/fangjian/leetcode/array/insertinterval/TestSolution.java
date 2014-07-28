package me.fangjian.leetcode.array.insertinterval;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

import static org.testng.AssertJUnit.*;

/**
 * Created at 7/27/14
 *
 * @author Jian Fang (jfang@rocketfuelinc.com)
 */
public class TestSolution {
    @Test
    public void testNoOverlapping(){
        List<Interval> intervals = new ArrayList<Interval>();
        intervals.add(new Interval(1, 3));
        intervals.add(new Interval(6, 9));
        List<Interval> newIntervals = new Solution().insert(intervals, new Interval(4, 5));
        assertEquals(newIntervals.size(), 3);
        assertEquals(newIntervals.get(0).start, 1);
        assertEquals(newIntervals.get(0).end, 3);
        assertEquals(newIntervals.get(1).start, 4);
        assertEquals(newIntervals.get(1).end, 5);
        assertEquals(newIntervals.get(2).start, 6);
        assertEquals(newIntervals.get(2).end, 9);
    }

    @Test
    public void testLeftOverlapping(){
        List<Interval> intervals = new ArrayList<Interval>();
        intervals.add(new Interval(1, 3));
        intervals.add(new Interval(6, 9));
        List<Interval> newIntervals = new Solution().insert(intervals, new Interval(2, 5));
        assertEquals(newIntervals.size(), 2);
        assertEquals(newIntervals.get(0).start, 1);
        assertEquals(newIntervals.get(0).end, 5);
        assertEquals(newIntervals.get(1).start, 6);
        assertEquals(newIntervals.get(1).end, 9);
    }

    @Test
    public void testRightOverlapping(){
        List<Interval> intervals = new ArrayList<Interval>();
        intervals.add(new Interval(1, 3));
        intervals.add(new Interval(6, 9));
        List<Interval> newIntervals = new Solution().insert(intervals, new Interval(4, 7));
        assertEquals(newIntervals.size(), 2);
        assertEquals(newIntervals.get(0).start, 1);
        assertEquals(newIntervals.get(0).end, 3);
        assertEquals(newIntervals.get(1).start, 4);
        assertEquals(newIntervals.get(1).end, 9);
    }

    @Test
    public void testMultipleOverlapping(){
        List<Interval> intervals = new ArrayList<Interval>();
        intervals.add(new Interval(1, 3));
        intervals.add(new Interval(6, 9));
        List<Interval> newIntervals = new Solution().insert(intervals, new Interval(2, 7));
        assertEquals(newIntervals.size(), 1);
        assertEquals(newIntervals.get(0).start, 1);
        assertEquals(newIntervals.get(0).end, 9);
    }
}
