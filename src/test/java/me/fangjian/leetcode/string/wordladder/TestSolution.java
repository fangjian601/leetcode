package me.fangjian.leetcode.string.wordladder;

import org.testng.annotations.Test;

import java.util.HashSet;
import java.util.Set;

import static org.testng.AssertJUnit.*;

/**
 * Created at 8/3/14
 *
 * @author Jian Fang (jfang@rocketfuelinc.com)
 */
public class TestSolution {
    @Test
    public void testSolution() {
        Solution solution = new Solution();
        Set<String> dict = new HashSet<String>();
        dict.add("hot");
        dict.add("dot");
        dict.add("dog");
        dict.add("lot");
        dict.add("log");
        assertEquals(solution.ladderLength("hit", "cog", dict), 5);
    }
}

