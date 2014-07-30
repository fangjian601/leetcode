package me.fangjian.leetcode.array.rmelement;

/**
 * Created at 7/28/14
 *
 * https://oj.leetcode.com/problems/remove-element/
 *
 * @author Jian Fang (jfang@rocketfuelinc.com)
 */
public class Solution {
    private void swap(int[] A, int i, int j){
        int tmp = A[i];
        A[i] = A[j];
        A[j] = tmp;
    }

    public int removeElement(int[] A, int elem) {
        if(A.length == 0){
            return 0;
        }
        int newLength = A.length;
        int i = 0, j = A.length - 1;
        while (i < A.length && j >= i){
            if(A[i] == elem && A[j] == elem){
                j--;
                newLength--;
            } else if(A[i] == elem){
                swap(A, i, j);
                newLength--;
                i++;
                j--;
            } else {
                i++;
            }
        }
        return newLength;
    }
}
