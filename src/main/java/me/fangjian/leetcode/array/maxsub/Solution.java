package me.fangjian.leetcode.array.maxsub;

/**
 * Created at 7/29/14
 *
 * https://oj.leetcode.com/problems/maximum-subarray/
 *
 * @author Jian Fang (jfang@rocketfuelinc.com)
 */
public class Solution {
    public int maxSubArray(int[] A) {
        if(A.length == 0){
            return 0;
        } else {
            int max = A[0];
            int sum = 0;
            for(int i = 0; i < A.length; i++){
                sum += A[i];
                max = Math.max(sum, max);
                if(sum <= 0){
                    sum = 0;
                }
            }
            return max;
        }
    }
}
