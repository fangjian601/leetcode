package me.fangjian.leetcode.array.singlenumber;

/**
 * Created at 7/28/14
 *
 * https://oj.leetcode.com/problems/single-number/
 *
 * @author Jian Fang (jfang@rocketfuelinc.com)
 */
public class Solution {
    public int singleNumber(int[] A) {
        int result = 0;
        for(int i = 0; i < A.length; i++){
            result ^= A[i];
        }
        return result;
    }
}
