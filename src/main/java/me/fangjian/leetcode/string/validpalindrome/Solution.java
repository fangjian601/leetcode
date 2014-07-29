package me.fangjian.leetcode.string.validpalindrome;

/**
 * Created at 7/28/14
 *
 * https://oj.leetcode.com/problems/valid-palindrome/
 *
 * @author Jian Fang (jfang@rocketfuelinc.com)
 */
public class Solution {
    private boolean shouldNotSkip(char ch){
        return (ch >= 'a' && ch <= 'z') || (ch >= '0' && ch <= '9');
    }

    public boolean isPalindrome(String s) {
        if(s == null){
            return false;
        }
        if(s.length() < 2){
            return true;
        }
        int i = 0, j = s.length() - 1;
        while(i < j){
            char chA = Character.toLowerCase(s.charAt(i));
            char chB = Character.toLowerCase(s.charAt(j));
            if(!shouldNotSkip(chA)){
                i++;
                continue;
            }
            if(!shouldNotSkip(chB)){
                j--;
                continue;
            }
            if(chA == chB){
                i++;
                j--;
            } else {
                return false;
            }
        }
        return true;
    }
}
