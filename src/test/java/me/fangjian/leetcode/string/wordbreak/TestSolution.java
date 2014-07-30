package me.fangjian.leetcode.string.wordbreak;

import org.testng.annotations.Test;

import java.util.HashSet;
import java.util.Set;

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
        Set<String> dict = new HashSet<String>();
        dict.add("leet");
        dict.add("code");
        assertEquals(solution.wordBreak("leetcode", dict), true);
    }
}
