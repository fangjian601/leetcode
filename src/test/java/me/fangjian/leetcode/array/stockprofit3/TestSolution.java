package me.fangjian.leetcode.array.stockprofit3;

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
        assertEquals(solution.maxProfit(new int[]{ 3, 4, 1, 2 }), 2);
    }
}
