package me.fangjian.leetcode.string.longestsub;

import java.util.HashMap;
import java.util.Map;

/**
 * Created at 8/1/14
 *
 * https://oj.leetcode.com/problems/longest-substring-without-repeating-characters/
 *
 * @author Jian Fang (jfang@rocketfuelinc.com)
 */
public class Solution {
    public int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> previousChars = new HashMap<Character, Integer>();
        int maxLength = 0;
        int startIndex = 0;
        for(int i = 0; i < s.length(); i++){
            Integer previousIndex = previousChars.get(s.charAt(i));
            if(previousIndex == null){
                maxLength = Math.max(maxLength, i - startIndex + 1);
                previousChars.put(s.charAt(i), i);
            } else {
                for(int j = startIndex; j <= previousIndex; j++){
                    previousChars.remove(s.charAt(j));
                }
                startIndex = previousIndex + 1;
                previousChars.put(s.charAt(i), i);
            }
        }
        return maxLength;
    }
}
