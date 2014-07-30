package me.fangjian.leetcode.array.stockprofit2;

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
        assertEquals(solution.maxProfit(new int[]{1, 2, 3, 4, 5}), 4);
    }
}
