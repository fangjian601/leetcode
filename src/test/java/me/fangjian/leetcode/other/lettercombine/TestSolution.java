package me.fangjian.leetcode.other.lettercombine;

import org.testng.annotations.Test;

import java.util.List;

import static org.testng.AssertJUnit.*;

/**
 * Created at 7/27/14
 *
 * @author Jian Fang (jfang@rocketfuelinc.com)
 */
public class TestSolution {
    @Test
    public void testEmptyString(){
        List<String> results = new Solution().letterCombinations("");
        assertEquals(results.size(), 1);
        assertEquals(results.get(0), "");
    }

    @Test
    public void testWithNumberOne(){
        List<String> results = new Solution().letterCombinations("12");
        assertEquals(results.size(), 3);
        assertEquals(results.get(0), "a");
        assertEquals(results.get(1), "b");
        assertEquals(results.get(2), "c");
    }

    @Test
    public void testMultipleNumbers(){
        List<String> results = new Solution().letterCombinations("213");
        assertEquals(results.size(), 9);
        assertEquals(results.get(0), "ad");
        assertEquals(results.get(1), "ae");
        assertEquals(results.get(2), "af");
        assertEquals(results.get(3), "bd");
        assertEquals(results.get(4), "be");
        assertEquals(results.get(5), "bf");
        assertEquals(results.get(6), "cd");
        assertEquals(results.get(7), "ce");
        assertEquals(results.get(8), "cf");
    }
}
