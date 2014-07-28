package me.fangjian.leetcode.array.stockprofit;

import org.testng.annotations.Test;
import static org.testng.AssertJUnit.*;

/**
 * Created at 7/25/14
 *
 * @author Jian Fang (jfang@rocketfuelinc.com)
 */
public class TestSolution {
    @Test
    public void testDescArray(){
        assertEquals(new Solution().maxProfit(new int[]{9,7,6,1}), 0);
    }

    @Test
    public void testAscArray(){
        assertEquals(new Solution().maxProfit(new int[]{1,2,3,4,5}), 4);
    }

    @Test
    public void testArray(){
        assertEquals(new Solution().maxProfit(new int[]{4, 9, 2, 5, 8, 1}), 6);
    }
}
