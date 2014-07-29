package me.fangjian.leetcode.array.medians;

/**
 * Created at 7/28/14
 *
 * https://oj.leetcode.com/problems/median-of-two-sorted-arrays/
 *
 * @author Jian Fang (jfang@rocketfuelinc.com)
 */
public class Solution {
    private int findKthElement(int A[], int startA, int endA,
                               int B[], int startB, int endB,
                               int k){
        int lenA = (endA - startA) + 1;
        int lenB = (endB - startB) + 1;
        if(lenA == 0){
            return B[startB + k];
        } else if(lenB == 0){
            return A[startA + k];
        } else if(k == 0){
            return Math.min(A[startA], B[startB]);
        }
        int midA = lenA * k / (lenA + lenB);
        int midB = k - 1 - midA;
        midA += startA;
        midB += startB;
        if(A[midA] >= B[midB]){
            return findKthElement(A, startA, midA, B, midB + 1, endB, k - (midB - startB + 1));
        } else {
            return findKthElement(A, midA + 1, endA, B, startB, midB, k - (midA - startA + 1));
        }
    }

    public double findMedianSortedArrays(int A[], int B[]) {
        if((A.length + B.length) % 2 == 0){
            return (findKthElement(A, 0, A.length - 1, B, 0, B.length - 1, (A.length + B.length) / 2) +
                    findKthElement(A, 0, A.length - 1, B, 0, B.length - 1, (A.length + B.length) / 2 - 1)) * 0.5;
        } else {
            return findKthElement(A, 0, A.length - 1, B, 0, B.length - 1, (A.length + B.length) / 2);
        }
    }
}
