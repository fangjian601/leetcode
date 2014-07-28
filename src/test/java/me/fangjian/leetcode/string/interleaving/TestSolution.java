package me.fangjian.leetcode.string.interleaving;

import org.testng.annotations.Test;
import static org.testng.AssertJUnit.*;

/**
 * Created at 7/28/14
 *
 * @author Jian Fang (jfang@rocketfuelinc.com)
 */
public class TestSolution {
    @Test
    public void testEmptyString(){
        Solution solution = new Solution();
        assertEquals(solution.isInterleave("abc", "", "abc"), true);
        assertEquals(solution.isInterleave("abc", "", "adc"), false);
        assertEquals(solution.isInterleave("", "abc", "abc"), true);
        assertEquals(solution.isInterleave("", "abc", "abd"), false);
        assertEquals(solution.isInterleave("", "", ""), true);
    }

    @Test
    public void testString(){
        Solution solution = new Solution();
        assertEquals(solution.isInterleave("aabcc", "dbbca", "aadbbcbcac"), true);
        assertEquals(solution.isInterleave("aabcc", "dbbca", "aadbbbaccc"), false);
    }
}
