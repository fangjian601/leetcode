package me.fangjian.leetcode.string.wordbreak;

import java.util.Set;

/**
 * Created at 7/29/14
 *
 * https://oj.leetcode.com/problems/word-break/
 *
 * @author Jian Fang (jfang@rocketfuelinc.com)
 */
public class Solution {
    public boolean wordBreak(String s, Set<String> dict) {
        boolean[] marks = new boolean[s.length()];
        for(int i = s.length() - 1; i >= 0; i--){
            if(i != s.length() - 1 && (!marks[i + 1])){
                continue;
            }
            for(int j = i; j >= 0; j--){
                String word = s.substring(j, i + 1);
                if(dict.contains(word)){
                    marks[j] = true;
                    if(j == 0){
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
