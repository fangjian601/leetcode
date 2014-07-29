package me.fangjian.leetcode.string.anagrams;

import org.testng.annotations.Test;

import java.util.Collections;
import java.util.List;

import static org.testng.AssertJUnit.*;

/**
 * Created at 7/28/14
 *
 * @author Jian Fang (jfang@rocketfuelinc.com)
 */
public class TestSolution {
    @Test
    public void testEmptyString(){
        List<String> result = new Solution().anagrams(new String[]{"", "p", ""});
        Collections.sort(result);
        assertEquals(result.size(), 2);
        assertEquals(result.get(0), "");
        assertEquals(result.get(1), "");
    }
}
