package me.fangjian.leetcode.array.nextperm;

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
        int[] num = new int[]{1, 2, 3, 4};
        solution.nextPermutation(num);
        assertArrayEquals(num, new int[]{1, 2, 4, 3});
    }
}
