package me.fangjian.leetcode.array.searchrotated;

/**
 * Created at 7/30/14
 *
 * @author Jian Fang (jfang@rocketfuelinc.com)
 */
public class Solution {
    private int search(int[] A, int start, int end, int target){
        int len = (end - start) + 1;
        if(len == 0){
            return -1;
        }
        int mid = start + len / 2;
        if(A[mid] == target){
            return mid;
        }
        if(A[start] < A[mid]){
            if(target >= A[start] && target < A[mid]){
                return search(A, start, mid - 1, target);
            } else {
                return search(A, mid + 1, end, target);
            }
        } else {
            if(target > A[mid] && target <= A[end]){
                return search(A, mid + 1, end, target);
            } else {
                return search(A, start, mid - 1, target);
            }
        }
    }

    public int search(int[] A, int target) {
        return search(A, 0, A.length - 1, target);
    }
}
