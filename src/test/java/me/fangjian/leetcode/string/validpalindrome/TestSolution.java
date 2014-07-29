package me.fangjian.leetcode.string.validpalindrome;

import org.testng.annotations.Test;
import static org.testng.AssertJUnit.*;

/**
 * Created at 7/28/14
 *
 * @author Jian Fang (jfang@rocketfuelinc.com)
 */
public class TestSolution {
    @Test
    public void testSolution(){
        assertEquals(new Solution().isPalindrome("A man, a plan, a canal: Panama"), true);
        assertEquals(new Solution().isPalindrome("race a car"), false);
    }
}
