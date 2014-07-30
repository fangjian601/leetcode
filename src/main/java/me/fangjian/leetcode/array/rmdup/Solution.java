package me.fangjian.leetcode.array.rmdup;

/**
 * Created at 7/29/14
 *
 * https://oj.leetcode.com/problems/remove-duplicates-from-sorted-array/
 *
 * @author Jian Fang (jfang@rocketfuelinc.com)
 */
public class Solution {
    public int removeDuplicates(int[] A) {
        if(A.length < 2){
            return A.length;
        } else {
            int storeIndex = 1;
            for(int i = 1; i < A.length; i++){
                if(A[i - 1] != A[i]){
                    A[storeIndex] = A[i];
                    storeIndex++;
                }
            }
            return storeIndex;
        }
    }
}
