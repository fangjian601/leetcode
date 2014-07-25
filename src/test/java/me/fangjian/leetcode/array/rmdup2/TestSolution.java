package me.fangjian.leetcode.array.rmdup2;

import org.testng.annotations.Test;

import java.util.Arrays;

import static org.testng.AssertJUnit.*;

/**
 * Created at 7/17/14
 *
 * @author Jian Fang (jfang@rocketfuelinc.com)
 */
public class TestSolution {
    @Test
    public void testEmptyArray(){
        assertEquals(new Solution().removeDuplicates(new int[]{}), 0);
    }

    @Test
    public void testMultipleElements(){
        int[] A = new int[]{1,1,1,2,2,3};
        assertEquals(new Solution().removeDuplicates(A), 5);
        assertArrayEquals(Arrays.copyOf(A, 5), new int[]{1,1,2,2,3});
    }
}
