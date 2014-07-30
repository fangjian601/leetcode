package me.fangjian.leetcode.array.insertpos;

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
        assertEquals(solution.searchInsert(new int[]{1, 3, 5, 6}, 5), 2);
        assertEquals(solution.searchInsert(new int[]{1, 3, 5, 6}, 2), 1);
        assertEquals(solution.searchInsert(new int[]{1, 3, 5, 6}, 7), 4);
        assertEquals(solution.searchInsert(new int[]{1, 3, 5, 6}, 0), 0);
    }
}
