package me.fangjian.leetcode.array.searchrange;

/**
 * Created at 7/31/14
 *
 * https://oj.leetcode.com/problems/search-for-a-range/
 *
 * @author Jian Fang (jfang@rocketfuelinc.com)
 */
public class Solution {
    private int[] searchRange(int[] A, int start, int end, int target){
        int len = (end - start) + 1;
        if(len == 0) { return new int[]{-1, -1}; }
        int mid = start + len / 2;
        if(A[mid] == target){
            int[] range = new int[]{mid, mid};
            if(mid < end && A[mid + 1] == target){
                if(A[end] == target){
                    range[1] = end;
                } else{
                    range[1] = searchRange(A, mid + 1, end, target)[1];
                }
            }
            if(mid > start && A[mid - 1] == target){
                if(A[start] == target){
                    range[0] = start;
                } else {
                    range[0] = searchRange(A, start, mid - 1, target)[0];
                }
            }
            return range;
        } else if (A[mid] > target){
            return searchRange(A, start, mid - 1, target);
        } else{
            return searchRange(A, mid + 1, end, target);
        }
    }

    public int[] searchRange(int[] A, int target) {
        return searchRange(A, 0, A.length - 1, target);
    }
}
