package me.fangjian.leetcode.array.longestconsecutive;

import org.testng.annotations.Test;
import static org.testng.AssertJUnit.*;

/**
 * Created at 7/30/14
 *
 * @author Jian Fang (jfang@rocketfuelinc.com)
 */
public class TestSolution {
    @Test
    public void testSolution() {
        Solution solution = new Solution();
        assertEquals(solution.longestConsecutive(new int[]{0,3,7,2,5,8,4,6,0,1}), 9);
    }
}
