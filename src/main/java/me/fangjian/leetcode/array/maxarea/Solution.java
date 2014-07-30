package me.fangjian.leetcode.array.maxarea;

/**
 * Created at 7/30/14
 *
 * https://oj.leetcode.com/problems/container-with-most-water/
 *
 * @author Jian Fang (jfang@rocketfuelinc.com)
 */
public class Solution {
    public int maxArea(int[] height) {
        if(height.length < 2) return 0;
        int maxArea = 0;
        int i = 0, j = height.length - 1;
        while(i != j){
            int left = height[i];
            int right = height[j];
            maxArea = Math.max(maxArea, Math.min(left, right) * (j - i));
            if(left < right){
                do{
                    i++;
                    if(height[i] > left) break;
                } while(i < j);
            } else {
                do{
                    j--;
                    if(height[j] > right) break;
                } while(i < j);
            }
        }
        return maxArea;
    }
}
