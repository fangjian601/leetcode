package me.fangjian.leetcode.string.regexp;

/**
 * Created at 8/3/14
 *
 * https://oj.leetcode.com/problems/regular-expression-matching/
 *
 * @author Jian Fang (jfang@rocketfuelinc.com)
 */
public class Solution {
    public boolean isMatch(String s, String p) {
        if(p.length() == 0) { return s.length() == 0; }
        int i = s.length() - 1, j = p.length() - 1;
        if(p.charAt(j) == '*'){
            char repeat = p.charAt(j - 1);
            if(isMatch(s.substring(0, i + 1), p.substring(0, j - 1))){
                return true;
            }
            if(repeat == '.'){
                while(i >= 0){
                    if(isMatch(s.substring(0, i), p.substring(0, j - 1))){
                        return true;
                    }
                    i--;
                }
            } else{
                while(i >= 0){
                    if(s.charAt(i) == repeat && isMatch(s.substring(0, i), p.substring(0, j - 1))){
                        return true;
                    } else if(s.charAt(i) != repeat){
                        break;
                    }
                    i--;
                }
            }
            return false;
        } else if(i >= 0 && p.charAt(j) == '.'){
            return isMatch(s.substring(0, i), p.substring(0, j));
        }
        return i >= 0 && s.charAt(i) == p.charAt(j) && isMatch(s.substring(0, i), p.substring(0, j));
    }
}
