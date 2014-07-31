package me.fangjian.leetcode.string.lastwordlen;

/**
 * Created at 7/30/14
 *
 * https://oj.leetcode.com/problems/length-of-last-word/
 *
 * @author Jian Fang (jfang@rocketfuelinc.com)
 */
public class Solution {
    public int lengthOfLastWord(String s) {
        int startIndex = 0;
        int lastLen = 0;
        for(int i = 0; i < s.length(); i++){
            if(i != 0 && s.charAt(i - 1) == ' ' && s.charAt(i) != ' '){
                startIndex = i;
            }
            if(s.charAt(i) != ' ' && (i == s.length() - 1 || s.charAt(i + 1) == ' ')){
                lastLen = i - startIndex + 1;
            }
        }
        return lastLen;
    }
}
