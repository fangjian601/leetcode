package me.fangjian.leetcode.string.longestcommonprefix;

/**
 * Created at 7/31/14
 *
 * https://oj.leetcode.com/problems/longest-common-prefix/
 *
 * @author Jian Fang (jfang@rocketfuelinc.com)
 */
public class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length == 0) { return ""; }
        StringBuilder sb = new StringBuilder();
        while(true){
            int len = sb.length();
            for(int i = 0; i < strs.length - 1; i++){
                if(strs[i].length() < len + 1 ||
                   strs[i + 1].length() < len + 1 ||
                   strs[i].charAt(len) != strs[i + 1].charAt(len)){
                   return sb.toString();
                }
            }
            if(strs[0].length() < len + 1){
                return sb.toString();
            } else {
                sb.append(strs[0].charAt(len));
            }
        }
    }
}
