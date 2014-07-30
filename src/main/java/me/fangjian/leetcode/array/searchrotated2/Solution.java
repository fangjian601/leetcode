package me.fangjian.leetcode.array.searchrotated2;

/**
 * Created at 7/30/14
 *
 * https://oj.leetcode.com/problems/search-in-rotated-sorted-array-ii/
 *
 * @author Jian Fang (jfang@rocketfuelinc.com)
 */
public class Solution {
    private boolean search(int[] A, int start, int end, int target){
        int len = (end - start) + 1;
        if(len == 0){
            return false;
        }
        int mid = start + len / 2;
        if(A[mid] == target){
            return true;
        }
        if(A[start] < A[mid]){
            if(target >= A[start] && target < A[mid]){
                return search(A, start, mid - 1, target);
            } else {
                return search(A, mid + 1, end, target);
            }
        } else if(A[start] > A[mid]) {
            if(target > A[mid] && target <= A[end]){
                return search(A, mid + 1, end, target);
            } else {
                return search(A, start, mid - 1, target);
            }
        } else {
            boolean isLeft = false;
            for(int i = start + 1; i < mid; i++){
                if(A[i] != A[start]){
                    isLeft = true;
                    break;
                }
            }
            if(isLeft){
                return search(A, start, mid - 1, target);
            } else {
                return search(A, mid + 1, end, target);
            }
        }
    }

    public boolean search(int[] A, int target) {
        return search(A, 0, A.length - 1, target);
    }
}
