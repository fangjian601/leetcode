package me.fangjian.leetcode.matrix.setzeroes;

/**
 * Created at 7/30/14
 *
 * https://oj.leetcode.com/problems/set-matrix-zeroes/
 *
 * @author Jian Fang (jfang@rocketfuelinc.com)
 */
public class Solution {
    public void setZeroes(int[][] matrix) {
        int rowIndex = -1, columnIndex = -1;
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[i].length; j++){
                if(matrix[i][j] != 0){
                    continue;
                }
                if(rowIndex == -1 && columnIndex == -1){
                    matrix[i][j] = 0;
                    rowIndex = i;
                    columnIndex = j;
                } else {
                    matrix[rowIndex][j] = 0;
                    matrix[i][columnIndex] = 0;
                }
            }
        }
        if(rowIndex != -1){
            for(int i = 0; i < matrix[rowIndex].length; i++){
                if(i != columnIndex && matrix[rowIndex][i] == 0){
                    for(int j = 0; j < matrix.length; j++){
                        matrix[j][i] = 0;
                    }
                }
            }
        }
        if(columnIndex != -1){
            for(int i = 0; i < matrix.length; i++){
                if(matrix[i][columnIndex] == 0){
                    for(int j = 0; j < matrix[i].length; j++){
                        matrix[i][j] = 0;
                    }
                }
            }
            for(int i = 0; i < matrix.length; i++){
                matrix[i][columnIndex] = 0;
            }
        }
    }
}
