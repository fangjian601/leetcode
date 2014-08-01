package me.fangjian.leetcode.string.zigzag;

/**
 * Created at 8/1/14
 *
 * https://oj.leetcode.com/problems/zigzag-conversion/
 *
 * @author Jian Fang (jfang@rocketfuelinc.com)
 */
public class Solution {
    public String convert(String s, int nRows) {
        if(nRows < 2) return s;
        int periodLen = 2 * nRows - 2;
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < s.length(); i += periodLen){
            sb.append(s.charAt(i));
        }
        for(int i = 1; i < nRows - 1; i++){
            for(int j = i; j < s.length(); j += periodLen){
                sb.append(s.charAt(j));
                if(j + periodLen - 2 * i < s.length()){
                    sb.append(s.charAt(j + periodLen - 2 * i));
                }
            }
        }
        for(int i = nRows - 1; i < s.length(); i += periodLen){
            sb.append(s.charAt(i));
        }
        return sb.toString();
    }
}
