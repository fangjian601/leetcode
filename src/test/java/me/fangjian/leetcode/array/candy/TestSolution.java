package me.fangjian.leetcode.array.candy;

import org.testng.annotations.Test;
import static org.testng.AssertJUnit.*;

/**
 * Created at 7/28/14
 *
 * @author Jian Fang (jfang@rocketfuelinc.com)
 */
public class TestSolution {
    @Test
    public void testOneElement(){
        assertEquals(new Solution().candy(new int[]{10}), 1);
    }

    @Test
    public void testTwoElements(){
        assertEquals(new Solution().candy(new int[]{10, 9}), 3);
        assertEquals(new Solution().candy(new int[]{10, 10}), 2);
        assertEquals(new Solution().candy(new int[]{9, 10}), 3);
    }

    @Test
    public void testMultipleElements(){
        assertEquals(new Solution().candy(new int[]{1,0,2}), 5);
    }
}
