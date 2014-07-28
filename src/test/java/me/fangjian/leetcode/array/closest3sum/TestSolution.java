package me.fangjian.leetcode.array.closest3sum;

import org.testng.annotations.Test;
import static org.testng.AssertJUnit.*;

/**
 * Created at 7/27/14
 *
 * @author Jian Fang (jfang@rocketfuelinc.com)
 */
public class TestSolution {
    @Test
    public void testSomething(){
        assertEquals(new Solution().threeSumClosest(new int[]{-1, 2, 1, -4}, 1), 2);
    }
}
