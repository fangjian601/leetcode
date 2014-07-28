package me.fangjian.leetcode.other.divide2int;

import org.testng.annotations.Test;
import static org.testng.AssertJUnit.*;

/**
 * Created at 7/25/14
 *
 * @author Jian Fang (jfang@rocketfuelinc.com)
 */
public class TestSolution {
    @Test
    public void testTwoPositive(){
        Solution solution = new Solution();
        assertEquals(solution.divide(4, 1), 4);
        assertEquals(solution.divide(4, 3), 1);
        assertEquals(solution.divide(3, 4), 0);
        assertEquals(solution.divide(0, 3), 0);
    }

    @Test
    public void testTwoNegative(){
        Solution solution = new Solution();
        assertEquals(solution.divide(-4, -1), 4);
        assertEquals(solution.divide(-4, -3), 1);
        assertEquals(solution.divide(-3, -4), 0);
    }

    @Test
    public void TestOnePositiveAndOneNegative(){
        Solution solution = new Solution();
        //assertEquals(solution.divide(-1010369383, -2147483648), 0);
        assertEquals(solution.divide(4, -3), -1);
        assertEquals(solution.divide(3, -4), 0);
    }
}
