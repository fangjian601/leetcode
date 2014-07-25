package me.fangjian.leetcode.other.palindromenum;


import org.testng.annotations.Test;

/**
 * Created at 7/24/14
 *
 * @author Jian Fang (jfang@rocketfuelinc.com)
 */
public class TestSolution {
    @Test
    public void testZero(){
        assert new Solution().isPalindrome(0);
    }

    @Test
    public void testSingleDigit(){
        assert new Solution().isPalindrome(3);
    }

    @Test
    public void testMultipleDigits(){
        assert new Solution().isPalindrome(11211);
    }

    @Test
    public void testNegative(){
        assert !(new Solution().isPalindrome(-2147447412));
    }

    @Test
    public void testMaxInteger(){
        assert !(new Solution().isPalindrome(Integer.MAX_VALUE));
    }

    @Test
    public void testMinInteger(){
        assert !(new Solution().isPalindrome(Integer.MIN_VALUE));
    }
}
