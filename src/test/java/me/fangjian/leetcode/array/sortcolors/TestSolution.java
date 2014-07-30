package me.fangjian.leetcode.array.sortcolors;

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
        int[] A = new int[]{2, 0, 1, 1, 0, 2};
        solution.sortColors(A);
        assertArrayEquals(A, new int[]{0, 0, 1, 1, 2, 2});
    }
}
