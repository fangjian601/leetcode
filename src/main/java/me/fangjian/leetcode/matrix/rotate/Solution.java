package me.fangjian.leetcode.matrix.rotate;

/**
 * Created at 7/25/14
 *
 * @author Jian Fang (jfang@rocketfuelinc.com)
 */
public class Solution {

    private void rotateElement(int[][] matrix, int startRow, int startCol, int currentRow, int currentCol){
        int n = matrix.length;
        int i = currentRow, j = currentCol;
        int p = matrix[i][j];
        do{
            int nextVal = matrix[j][n - 1 - i];
            int tmp = i;
            matrix[j][n - 1 - i] = p;
            p = nextVal;
            i = j;
            j = n - 1 -tmp;
        }while(i != startRow || j != startCol);
    }

    public void rotate(int[][] matrix) {
        int n = matrix.length;
        if(n < 2) return;
        for(int i = 0; i < n / 2; i++){
            for(int j = i; j < n - 1 - i; j++){
                rotateElement(matrix, i, j, i, j);
            }
        }
    }
}
