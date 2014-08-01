package me.fangjian.leetcode.string.palindromepartition;

import org.testng.annotations.Test;

import java.util.List;

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
        List<List<String>> result = solution.partition("aab");
        assertEquals(result.size(), 2);
    }
}
