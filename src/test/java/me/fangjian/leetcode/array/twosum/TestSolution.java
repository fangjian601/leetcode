package me.fangjian.leetcode.array.twosum;

import org.testng.annotations.Test;
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
        assertArrayEquals(solution.twoSum(new int[]{4, 3, 2}, 6), new int[]{1, 3});
    }
}
