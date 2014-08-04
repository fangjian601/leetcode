package me.fangjian.leetcode.array.mergeintervals;

import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;

import static org.testng.AssertJUnit.*;

/**
 * Created at 8/3/14
 *
 * @author Jian Fang (jfang@rocketfuelinc.com)
 */
public class TestSolution {
    @Test
    public void testSolution() {
        Solution solution = new Solution();
        List<Interval> intervals = Arrays.asList(new Interval(1, 3), new Interval(2, 6),
                new Interval(8, 10), new Interval(15, 18));
        assertEquals(solution.merge(intervals).size(), 3);
    }
}
