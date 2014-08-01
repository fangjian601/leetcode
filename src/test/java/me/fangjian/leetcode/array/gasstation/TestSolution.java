package me.fangjian.leetcode.array.gasstation;

import org.testng.annotations.Test;
import static org.testng.AssertJUnit.*;

/**
 * Created at 8/1/14
 *
 * @author Jian Fang (jfang@rocketfuelinc.com)
 */
public class TestSolution {
    @Test
    public void testSolution() {
        Solution solution = new Solution();
        assertEquals(solution.canCompleteCircuit(new int[]{4, 5}, new int[] {5, 4}), 1);
    }
}
