package me.fangjian.leetcode.array.singlenumber2;

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
        assertEquals(solution.singleNumber(new int[]{1, 1, 1, 10001, 2, 2, 2}), 10001);
    }
}
