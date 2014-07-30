package me.fangjian.leetcode.array.rmelement;

import org.testng.annotations.Test;
import static org.testng.AssertJUnit.*;

/**
 * Created at 7/28/14
 *
 * @author Jian Fang (jfang@rocketfuelinc.com)
 */
public class TestSolution {
    @Test
    public void testSolution(){
        Solution solution = new Solution();
        assertEquals(solution.removeElement(new int[]{1, 1, 1, 1}, 1), 0);
        assertEquals(solution.removeElement(new int[]{1, 2, 1, 1}, 1), 1);
    }
}
