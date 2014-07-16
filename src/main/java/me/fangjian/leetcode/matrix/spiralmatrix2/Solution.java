package me.fangjian.leetcode.matrix.spiralmatrix2;

/**
 * Created at 7/16/14
 *
 * https://oj.leetcode.com/problems/spiral-matrix-ii/
 *
 * @author Jian Fang (jfang@rocketfuelinc.com)
 */
public class Solution {
    public enum Direction{
        RIGHT,DOWN,LEFT,UP
    }

    public int[][] generateMatrix(int n) {
        int[][] result = new int[n][n];
        Direction direction = Direction.RIGHT;
        int i = 0, j = 0;
        int num = 1;
        while(num <= n * n){
            result[i][j] = num;
            num++;
            switch (direction){
                case RIGHT:
                    if(j + 1 < n && result[i][j+1] == 0){
                        j++;
                    } else {
                        direction = Direction.DOWN;
                        i++;
                    }
                    break;
                case DOWN:
                    if(i + 1 < n && result[i+1][j] == 0){
                        i++;
                    } else {
                        direction = Direction.LEFT;
                        j--;
                    }
                    break;
                case LEFT:
                    if(j - 1 >= 0 && result[i][j - 1] == 0){
                        j--;
                    } else {
                        direction = Direction.UP;
                        i--;
                    }
                    break;
                case UP:
                    if(i - 1 >= 0 && result[i - 1][j] == 0){
                        i--;
                    } else {
                        direction = Direction.RIGHT;
                        j++;
                    }
                    break;
            }
        }
        return result;
    }
}
