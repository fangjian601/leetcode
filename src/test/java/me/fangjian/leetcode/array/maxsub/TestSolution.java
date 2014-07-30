package me.fangjian.leetcode.array.maxsub;

import org.testng.annotations.Test;
import static org.testng.AssertJUnit.*;

/**
 * Created at 7/29/14
 *
 * @author Jian Fang (jfang@rocketfuelinc.com)
 */
public class TestSolution {
    @Test
    public void testSolution(){
        Solution solution = new Solution();
        assertEquals(solution.maxSubArray(new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4}), 6);
    }
}
