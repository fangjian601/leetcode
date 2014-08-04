package me.fangjian.leetcode.string.longestpalindromesubstr;

/**
 * Created at 8/3/14
 *
 * https://oj.leetcode.com/problems/longest-palindromic-substring/
 *
 * @author Jian Fang (jfang@rocketfuelinc.com)
 */
public class Solution {
    public String longestPalindrome(String s) {
        boolean[][] palindrome = new boolean[s.length()][s.length()];
        int start = 0, end = 0;
        for(int i = s.length() - 1; i >= 0; i--){
            for(int j = i; j < s.length(); j++){
                if(i == j){
                    palindrome[i][j] = true;
                } else {
                    if(s.charAt(i) == s.charAt(j)){
                        if(i + 1 >= j - 1){
                            palindrome[i][j] = true;
                        } else {
                            palindrome[i][j] = palindrome[i + 1][j - 1];
                        }
                    } else {
                        palindrome[i][j] = false;
                    }
                }
                if(palindrome[i][j]){
                    if(j - i + 1 > end - start + 1){
                        start = i;
                        end = j;
                    }
                }
            }
        }
        return s.substring(start, end + 1);
    }
}
