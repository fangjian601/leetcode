package me.fangjian.leetcode.array.rmdup;

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
        assertEquals(solution.removeDuplicates(new int[]{1, 1, 1, 2}), 2);
    }
}
