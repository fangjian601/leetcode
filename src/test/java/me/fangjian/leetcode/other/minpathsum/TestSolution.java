package me.fangjian.leetcode.other.minpathsum;

import org.testng.annotations.Test;
import static org.testng.AssertJUnit.*;

/**
 * Created at 7/29/14
 *
 * @author Jian Fang (jfang@rocketfuelinc.com)
 */
public class TestSolution {
    @Test
    public void testSolution() {
        Solution solution = new Solution();
        int[][] grid = new int[][]{
                {1, 2, 3},
                {4, 5, 6}
        };
        assertEquals(solution.minPathSum(grid), 12);
    }
}
