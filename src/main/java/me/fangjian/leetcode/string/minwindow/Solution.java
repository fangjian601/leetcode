package me.fangjian.leetcode.string.minwindow;

import java.util.*;

/**
 * Created at 8/4/14
 *
 * https://oj.leetcode.com/problems/minimum-window-substring/
 *
 * @author Jian Fang (jfang@rocketfuelinc.com)
 */
public class Solution {
    public String minWindow(String S, String T) {
        Map<Character, Integer> target = new HashMap<Character, Integer>();
        int start = 0;
        int minLength = -1, minStart = 0, minEnd = 0;
        for(int i = 0; i < T.length(); i++){
            Integer count = target.get(T.charAt(i));
            if(count == null){
                count = 1;
            } else {
                count++;
            }
            target.put(T.charAt(i), count);
        }
        int targetSize = target.size();
        for(int i = 0; i < S.length(); i++){
            Integer count = target.get(S.charAt(i));
            if(count != null){
                target.put(S.charAt(i), count - 1);
                if(count - 1 == 0){
                    targetSize--;
                }
                if(targetSize == 0){
                    boolean foundNextStart = false;
                    for(int j = start; j <= i; j++){
                        count = target.get(S.charAt(j));
                        if(count != null && targetSize == 0){
                            if(minLength == -1 || minLength > i - j + 1){
                                minLength = i - j + 1;
                                minStart = j;
                                minEnd = i + 1;
                            }
                            target.put(S.charAt(j), count + 1);
                            if(count == 0){
                                targetSize++;
                            }
                        } else if(count != null) {
                            foundNextStart = true;
                            start = j;
                            break;
                        }
                    }
                    if(!foundNextStart){
                        start = i + 1;
                    }
                }
            }
        }
        return S.substring(minStart, minEnd);
    }
}
