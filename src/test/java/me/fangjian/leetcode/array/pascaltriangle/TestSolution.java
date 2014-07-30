package me.fangjian.leetcode.array.pascaltriangle;

import org.testng.annotations.Test;

import java.util.List;

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
        List<List<Integer>> triangle = solution.generate(3);
        assertEquals(triangle.size(), 3);
    }
}
