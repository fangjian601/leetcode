package me.fangjian.leetcode.string.substrconcat;

import org.testng.annotations.Test;

import java.util.Arrays;

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
        assertEquals(solution.findSubstring("abababab",
                new String[]{"a", "b"}), Arrays.asList(0,1,2,3,4,5,6));
    }
}
