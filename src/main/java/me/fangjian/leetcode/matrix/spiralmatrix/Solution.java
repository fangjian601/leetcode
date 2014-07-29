package me.fangjian.leetcode.matrix.spiralmatrix;

import java.util.ArrayList;
import java.util.List;

/**
 * Created at 7/28/14
 *
 * https://oj.leetcode.com/problems/spiral-matrix/
 *
 * @author Jian Fang (jfang@rocketfuelinc.com)
 */
public class Solution {
    private enum Direction{
        RIGHT,DOWN,LEFT,UP
    }
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<Integer>();
        if(matrix == null) return result;
        int size = matrix.length;
        if(size != 0) {size *= matrix[0].length;}
        int i = 0, j = 0;
        Direction direction = Direction.RIGHT;
        while(result.size() < size){
            if(i < matrix.length && j < matrix[i].length){
                result.add(matrix[i][j]);
                switch (direction){
                    case RIGHT:
                        if(j < matrix[i].length - 1 - i){
                            j++;
                        } else {
                            i++;
                            direction = Direction.DOWN;
                        }
                        break;
                    case DOWN:
                        if(i < matrix.length - matrix[i].length + j){
                            i++;
                        } else {
                            j--;
                            direction = Direction.LEFT;
                        }
                        break;
                    case LEFT:
                        if(j > matrix.length - i - 1){
                            j--;
                        } else {
                            i--;
                            direction = Direction.UP;
                        }
                        break;
                    case UP:
                        if(i > j + 1){
                           i--;
                        } else {
                            j++;
                            direction = Direction.RIGHT;
                        }
                        break;
                }
            } else {
                break;
            }
        }
        return result;
    }
}
