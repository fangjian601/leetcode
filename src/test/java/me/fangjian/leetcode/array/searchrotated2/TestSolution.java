package me.fangjian.leetcode.array.searchrotated2;

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
        assertEquals(solution.search(new int[]{4, 5, 1, 1, 2}, 4), true);
        assertEquals(solution.search(new int[]{4, 5, 1, 1, 2}, 3), false);
    }
}
