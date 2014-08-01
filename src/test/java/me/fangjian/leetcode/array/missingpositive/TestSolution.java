package me.fangjian.leetcode.array.missingpositive;

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
        assertEquals(solution.firstMissingPositive(new int[]{3, 4, -1, 1}), 2);
    }
}
