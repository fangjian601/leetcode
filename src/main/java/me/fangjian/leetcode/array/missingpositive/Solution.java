package me.fangjian.leetcode.array.missingpositive;

/**
 * Created at 8/1/14
 *
 * https://oj.leetcode.com/problems/first-missing-positive/
 *
 * @author Jian Fang (jfang@rocketfuelinc.com)
 */
public class Solution {
    public int firstMissingPositive(int[] A) {
        for(int i = 0; i < A.length; i++){
            while(A[i] > 0 && A[i] <= A.length && A[A[i] - 1] != A[i]){
                int tmp = A[i];
                A[i] = A[A[i] - 1];
                A[tmp - 1] = tmp;
            }
        }
        for(int i = 0; i < A.length; i++){
            if(A[i] != i + 1){
                return i + 1;
            }
        }
        return A.length + 1;
    }
}
