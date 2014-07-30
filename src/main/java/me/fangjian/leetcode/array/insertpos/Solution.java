package me.fangjian.leetcode.array.insertpos;

/**
 * Created at 7/29/14
 *
 * https://oj.leetcode.com/problems/search-insert-position/
 *
 * @author Jian Fang (jfang@rocketfuelinc.com)
 */
public class Solution {
    private int searchInsert(int[] A, int start, int end, int target){
        int len = (end - start) + 1;
        if(len == 0){
            return start;
        } else if(len == 1){
            if(A[start] >= target) return start;
            else return start + 1;
        } else{
            int mid = start + len / 2;
            if(A[mid] == target){
                return mid;
            } else if(A[mid] > target){
                return searchInsert(A, start, mid - 1, target);
            } else{
                return searchInsert(A, mid + 1, end, target);
            }
        }
    }

    public int searchInsert(int[] A, int target) {
        return searchInsert(A, 0, A.length - 1, target);
    }
}
