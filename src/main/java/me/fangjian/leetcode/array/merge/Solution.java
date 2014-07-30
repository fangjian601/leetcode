package me.fangjian.leetcode.array.merge;

/**
 * Created at 7/29/14
 *
 * https://oj.leetcode.com/problems/merge-sorted-array/
 *
 * @author Jian Fang (jfang@rocketfuelinc.com)
 */
public class Solution {
    public void merge(int A[], int m, int B[], int n) {
        int storeIndex = (m + n) - 1, indexA = m - 1, indexB = n - 1;
        while(storeIndex >= 0){
            if((indexA >= 0 && indexB < 0) || (indexA >= 0 && A[indexA] >= B[indexB])){
                A[storeIndex] = A[indexA];
                indexA--;
            } else if((indexA < 0 && indexB >= 0) || (indexB >= 0 && A[indexA] < B[indexB])){
                A[storeIndex] = B[indexB];
                indexB--;
            }
            storeIndex--;
        }
    }
}
