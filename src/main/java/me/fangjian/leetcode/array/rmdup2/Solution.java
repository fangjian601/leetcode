package me.fangjian.leetcode.array.rmdup2;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created at 7/17/14
 *
 * https://oj.leetcode.com/problems/remove-duplicates-from-sorted-array-ii/
 *
 * @author Jian Fang (jfang@rocketfuelinc.com)
 */
public class Solution {

    public int removeDuplicates(int[] A) {
        if(A == null) return 0;
        if(A.length > 2){
            int len = 2;
            for(int i = 2; i < A.length; i++){
                if(A[len - 2] != A[i]){
                    A[len++] = A[i];
                }
            }
            return len;
        } else {
            return A.length;
        }

    }
}
