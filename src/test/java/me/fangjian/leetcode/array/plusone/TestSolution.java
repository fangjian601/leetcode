package me.fangjian.leetcode.array.plusone;

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
        assertArrayEquals(solution.plusOne(new int[]{9, 9, 9}), new int[]{1, 0, 0, 0});
    }
}
