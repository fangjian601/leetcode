package me.fangjian.leetcode.other.graycode;

import org.testng.annotations.Test;

import java.util.List;

import static org.testng.AssertJUnit.*;

/**
 * Created at 7/17/14
 *
 * @author Jian Fang (jfang@rocketfuelinc.com)
 */
public class TestSolution {
    @Test
    public void testZero(){
        assertEquals(new Solution().grayCode(0).size(), 1);
        assertEquals(new Solution().grayCode(0).get(0).intValue(), 0);
    }

    @Test
    public void testTwo(){
        List<Integer> result = new Solution().grayCode(2);
        assertEquals(result.size(), 4);
        assertEquals(result.get(0).intValue(), 0);
        assertEquals(result.get(1).intValue(), 1);
        assertEquals(result.get(2).intValue(), 3);
        assertEquals(result.get(3).intValue(), 2);
    }
}
