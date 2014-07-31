package me.fangjian.leetcode.matrix.validsudoku;

/**
 * Created at 7/30/14
 *
 * @author Jian Fang (jfang@rocketfuelinc.com)
 */
public class Solution {
    public boolean isValidSudoku(char[][] board) {
        boolean[][] subFlag = new boolean[9][9];
        for(int i = 0; i < 9; i++){
            subFlag[i] = new boolean[9];
        }
        for(int i = 0; i < 9; i++){
            boolean[] rowFlag = new boolean[9];
            boolean[] colFlag = new boolean[9];
            for(int j = 0; j < 9; j++){
                if(board[i][j] != '.'){
                    if(rowFlag[board[i][j] - '1']){
                        return false;
                    } else {
                        rowFlag[board[i][j] - '1'] = true;
                    }
                    int subIndex = (i / 3) * 3 + (j / 3);
                    if(subFlag[subIndex][board[i][j] - '1']){
                        return false;
                    } else {
                        subFlag[subIndex][board[i][j] - '1'] = true;
                    }
                }
                if(board[j][i] != '.'){
                    if(colFlag[board[j][i] - '1']){
                        return false;
                    } else {
                        colFlag[board[j][i] - '1'] = true;
                    }
                }

            }
        }
        return true;
    }
}
