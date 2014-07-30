package me.fangjian.leetcode.string.wordbreak2;

import org.testng.annotations.Test;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static org.testng.AssertJUnit.*;

/**
 * Created at 7/25/14
 *
 * @author Jian Fang (jfang@rocketfuelinc.com)
 */
public class TestSolution {
    @Test
    public void testNonExist(){
        Set<String> dict = new HashSet<String>();
        dict.add("cats");
        dict.add("and");
        dict.add("dog");
        assertEquals(new Solution().wordBreak("cztsanddog", dict).isEmpty(), true);
    }

    @Test
    public void testResult(){
        Set<String> dict = new HashSet<String>();
        dict.add("cats");
        dict.add("and");
        dict.add("dog");
        dict.add("cat");
        dict.add("sand");
        List<String> result = new Solution().wordBreak("catsanddog", dict);
        assertEquals(result.size(), 2);
        assertEquals(result.get(0), "cats and dog");
        assertEquals(result.get(1), "cat sand dog");
    }
}
