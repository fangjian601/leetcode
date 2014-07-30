package me.fangjian.leetcode.array.merge;

import org.testng.annotations.Test;
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
        int[] a = new int[2];
        int[] b = new int[]{1};
        solution.merge(a, 0, b, 1);
        assertArrayEquals(a, new int[]{1, 0});
    }
}
