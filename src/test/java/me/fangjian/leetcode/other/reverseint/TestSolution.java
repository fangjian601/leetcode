package me.fangjian.leetcode.other.reverseint;

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
        assertEquals(solution.reverse(13), 31);
        assertEquals(solution.reverse(-1), -1);
    }
}
