package me.fangjian.leetcode.string.longestvalidparentheses;

import org.testng.annotations.Test;
import static org.testng.AssertJUnit.*;

/**
 * Created at 8/3/14
 *
 * @author Jian Fang (jfang@rocketfuelinc.com)
 */
public class TestSolution {
    @Test
    public void testSolution() {
        Solution solution = new Solution();
        assertEquals(solution.longestValidParentheses(")()())"), 4);
    }
}

