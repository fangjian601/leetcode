package me.fangjian.leetcode.array.jump2;

import org.testng.annotations.Test;
import static org.testng.AssertJUnit.*;

/**
 * Created at 7/27/14
 *
 * @author Jian Fang (jfang@rocketfuelinc.com)
 */
public class TestSolution {
    @Test
    public void testEmpty(){
        assertEquals(new Solution().jump(new int[]{}), 0);
    }

    @Test
    public void testOne(){
        assertEquals(new Solution().jump(new int[]{2}), 0);
    }

    @Test
    public void testMultiple(){
        assertEquals(new Solution().jump(new int[]{2, 3, 1, 1, 4}), 2);
    }
}
