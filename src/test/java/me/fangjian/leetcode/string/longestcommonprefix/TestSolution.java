package me.fangjian.leetcode.string.longestcommonprefix;

import org.testng.annotations.Test;
import static org.testng.AssertJUnit.*;

/**
 * Created at 7/31/14
 *
 * @author Jian Fang (jfang@rocketfuelinc.com)
 */
public class TestSolution {
    @Test
    public void testSolution() {
        Solution solution = new Solution();
        assertEquals(solution.longestCommonPrefix(new String[]{
                "abcdef",
                "abc",
                "abcz"
        }), "abc");
    }
}
