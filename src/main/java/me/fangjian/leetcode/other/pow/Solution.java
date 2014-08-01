package me.fangjian.leetcode.other.pow;

/**
 * Created at 7/31/14
 *
 * https://oj.leetcode.com/problems/powx-n/
 *
 * @author Jian Fang (jfang@rocketfuelinc.com)
 */
public class Solution {
    public double pow(double x, int n) {
        if(n == 0) { return 1; }
        if(n % 2 == 0){
            return pow(x * x, n / 2);
        } else {
            if(n < 0){
                return pow(x * x, n / 2) / x;
            } else {
                return pow(x * x, n / 2) * x;
            }
        }
    }
}
