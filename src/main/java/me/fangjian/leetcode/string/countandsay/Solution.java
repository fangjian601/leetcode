package me.fangjian.leetcode.string.countandsay;

/**
 * Created at 7/31/14
 *
 * https://oj.leetcode.com/problems/count-and-say/
 *
 * @author Jian Fang (jfang@rocketfuelinc.com)
 */
public class Solution {
    private String say(String s){
        StringBuilder sb = new StringBuilder();
        int start = 0;
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) != s.charAt(start)){
                sb.append(i - start);
                sb.append(s.charAt(start));
                start = i;
            }
            if(i == s.length() - 1){
                sb.append(i - start + 1);
                sb.append(s.charAt(start));
            }
        }
        return sb.toString();
    }

    public String countAndSay(int n) {
        if(n == 0) { return ""; }
        String s = "1";
        for(int i = 1; i < n; i++){
            s = say(s);
        }
        return s;
    }
}
