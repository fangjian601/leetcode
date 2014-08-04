package me.fangjian.leetcode.array.foursum;

import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;

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
        List<List<Integer>> result = solution.fourSum(new int[]{1, 0, -1, 0, -2, 2}, 0);
        assertEquals(result.size(), 3);
        assertEquals(result.get(0), Arrays.asList(-2, -1, 1, 2));
        assertEquals(result.get(1), Arrays.asList(-2, 0, 0, 2));
        assertEquals(result.get(2), Arrays.asList(-1, 0, 0, 1));
    }
}
