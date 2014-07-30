package me.fangjian.leetcode.array.maxarea;

import org.testng.annotations.Test;
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
        assertEquals(solution.maxArea(new int[]{1, 5, 1, 1, 1, 5, 1}), 20);
    }
}
