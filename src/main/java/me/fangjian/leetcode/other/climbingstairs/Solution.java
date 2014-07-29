package me.fangjian.leetcode.other.climbingstairs;

/**
 * Created at 7/28/14
 *
 * https://oj.leetcode.com/problems/climbing-stairs/
 *
 * @author Jian Fang (jfang@rocketfuelinc.com)
 */
public class Solution {
    public int climbStairs(int n) {
        int[] paths = new int[n];
        paths[0] = 1;
        if(n > 1){paths[1] = 2;}
        for(int i = 2; i < n ; i++){
            paths[i] = paths[i - 1] + paths[i - 2];
        }
        return paths[n - 1];
    }
}
