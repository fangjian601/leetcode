package me.fangjian.leetcode.other.sqrt;

/**
 * Created at 8/1/14
 *
 * https://oj.leetcode.com/problems/sqrtx/
 *
 * @author Jian Fang (jfang@rocketfuelinc.com)
 */
public class Solution {
    public int sqrt(int x) {
        if(x < 2) { return x; }
        int left = 1;
        int right = x / 2 + 1;
        while(left <= right){
            int mid = (left + right) / 2;
            if(x / mid >= mid && x / (mid + 1) < (mid + 1)){
                return mid;
            }
            if(x / mid < mid){
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return 0;
    }
}
