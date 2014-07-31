package me.fangjian.leetcode.array.trapwater;

/**
 * Created at 7/30/14
 *
 * https://oj.leetcode.com/problems/trapping-rain-water/
 *
 * @author Jian Fang (jfang@rocketfuelinc.com)
 */
public class Solution {

    public int trap(int[] A) {
        if(A.length < 2) return 0;
        int total = 0;
        int block = 0;
        int left = 0, right = A.length - 1;
        int currentHeight = 0;
        while(left <= right){
            int height = Math.min(A[left], A[right]);
            if(height > currentHeight){
                total += (height - currentHeight) * (right - left + 1);
                currentHeight = height;
            }
            if(A[left] < A[right]){
                block += A[left];
                left++;
            } else {
                block += A[right];
                right--;
            }
        }
        return total - block;
    }
}
