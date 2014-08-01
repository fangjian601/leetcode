package me.fangjian.leetcode.string.addbinary;

/**
 * Created at 7/31/14
 *
 * https://oj.leetcode.com/problems/add-binary/
 *
 * @author Jian Fang (jfang@rocketfuelinc.com)
 */
public class Solution {

    public String addBinary(String a, String b) {
        int forward = 0;
        StringBuilder sb = new StringBuilder();
        int i = a.length() - 1, j = b.length() - 1;
        while(i >= 0 || j >= 0){
            if(i >= 0 && j >= 0){
                int left = a.charAt(i) - '0';
                int right = b.charAt(j) - '0';
                sb.append((left + right + forward) % 2);
                forward = (left + right + forward) > 1 ? 1 : 0;
            } else if(i >= 0 && j < 0){
                int left = a.charAt(i) - '0';
                sb.append((left + forward) % 2);
                forward = (left + forward) > 1 ? 1 : 0;
            } else if(i < 0 && j >= 0){
                int right = b.charAt(j) - '0';
                sb.append((right + forward) % 2);
                forward = (right + forward) > 1 ? 1 : 0;
            }
            i--;
            j--;
        }
        if(forward == 1) sb.append('1');
        return sb.reverse().toString();
    }
}
