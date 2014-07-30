package me.fangjian.leetcode.matrix.search;

/**
 * Created at 7/29/14
 *
 * https://oj.leetcode.com/problems/search-a-2d-matrix/
 *
 * @author Jian Fang (jfang@rocketfuelinc.com)
 */
public class Solution {
    private int getElement(int[][] matrix, int index){
        int m = matrix.length;
        int n = (m == 0 ? 0 : matrix[0].length);
        int i = index / n;
        int j = index % n;
        return matrix[i][j];
    }

    private boolean searchMatrix(int[][] matrix, int start, int end, int target){
        int len = (end - start) + 1;
        if(len == 0){
            return false;
        } else {
            int mid = start + len / 2;
            if(getElement(matrix, mid) == target){
                return true;
            } else if(getElement(matrix, mid) > target){
                return searchMatrix(matrix, start, mid - 1, target);
            } else {
                return searchMatrix(matrix, mid + 1, end, target);
            }
        }
    }

    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        int n = (m == 0 ? 0 : matrix[0].length);
        return searchMatrix(matrix, 0, m * n - 1, target);
    }
}
