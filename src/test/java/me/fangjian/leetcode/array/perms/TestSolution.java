package me.fangjian.leetcode.array.perms;

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
    public void testSolution(){
        Solution solution = new Solution();
        List<List<Integer>> results = solution.permute(new int[]{1,1,2});
        assertEquals(results.size(), 3);
    }
}
