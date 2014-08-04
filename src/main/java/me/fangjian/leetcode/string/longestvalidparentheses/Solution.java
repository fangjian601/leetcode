package me.fangjian.leetcode.string.longestvalidparentheses;

/**
 * Created at 8/3/14
 *
 * https://oj.leetcode.com/problems/longest-valid-parentheses/
 *
 * @author Jian Fang (jfang@rocketfuelinc.com)
 */
public class Solution {
    public int longestValidParentheses(String s) {
        int[] longest = new int[s.length()];
        int maxLength = 0;
        for(int i = 1; i < longest.length; i++){
            if(s.charAt(i) == ')'){
                if(s.charAt(i - 1) == '('){
                    if(i > 1){
                        longest[i] = longest[i - 2] + 2;
                    } else {
                        longest[i] = 2;
                    }
                } else {
                    if(i - longest[i - 1] - 1 >= 0 && s.charAt(i - longest[i - 1] - 1) == '('){
                        if(i - longest[i - 1] - 2 >= 0){
                            longest[i] = longest[i - 1] + 2 + longest[i - longest[i - 1] - 2];
                        } else {
                            longest[i] = longest[i - 1] + 2;
                        }
                    }
                }
            }
            maxLength = Math.max(maxLength, longest[i]);
        }
        return maxLength;
    }
}
