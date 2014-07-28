package me.fangjian.leetcode.string.interleaving;

import java.util.Stack;

/**
 * Created at 7/27/14
 *
 * https://oj.leetcode.com/problems/interleaving-string/
 *
 * @author Jian Fang (jfang@rocketfuelinc.com)
 */
public class Solution {
    public boolean isInterleave(String s1, String s2, String s3) {
        if(s3.length() == s1.length() + s2.length()){
            boolean[][] marks = new boolean[s1.length() + 1][s2.length() + 1];
            for(int i = 0; i <= s1.length(); i++){
                for(int j = 0; j <= s2.length(); j++){
                    if(i == 0 && j == 0){
                        marks[i][j] = true;
                    } else {
                        if(i > 0){
                            marks[i][j] = marks[i][j] || (marks[i - 1][j] && s1.charAt(i - 1) == s3.charAt(i + j - 1));
                        }
                        if(j > 0){
                            marks[i][j] = marks[i][j] || (marks[i][j - 1] && s2.charAt(j - 1) == s3.charAt(i + j - 1));
                        }
                    }
                }
            }
            return marks[s1.length()][s2.length()];
        }
        return false;
    }
}
