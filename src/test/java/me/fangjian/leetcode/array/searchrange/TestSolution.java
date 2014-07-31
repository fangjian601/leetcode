package me.fangjian.leetcode.array.searchrange;

import org.testng.annotations.Test;
import static org.testng.AssertJUnit.*;

/**
 * Created at 7/31/14
 *
 * @author Jian Fang (jfang@rocketfuelinc.com)
 */
public class TestSolution {
    @Test
    public void testSolution() {
        Solution solution = new Solution();
        assertArrayEquals(solution.searchRange(new int[]{5, 7, 7, 8, 8, 10}, 8), new int[]{3, 4});
    }
}
