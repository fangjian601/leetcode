package me.fangjian.leetcode.array.pascaltriangle2;

import org.testng.annotations.Test;

import java.util.List;

import static org.testng.AssertJUnit.*;

/**
 * Created at 7/30/14
 *
 * @author Jian Fang (jfang@rocketfuelinc.com)
 */
public class TestSolution {
    @Test
    public void testSolution() {
        Solution solution = new Solution();
        List<Integer> row = solution.getRow(3);
        assertEquals(row.size(), 4);
        assertEquals(row.get(0), new Integer(1));
        assertEquals(row.get(1), new Integer(3));
        assertEquals(row.get(2), new Integer(3));
        assertEquals(row.get(3), new Integer(1));
    }
}
