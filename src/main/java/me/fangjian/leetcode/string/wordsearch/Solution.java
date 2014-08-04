package me.fangjian.leetcode.string.wordsearch;

/**
 * Created at 8/3/14
 *
 * https://oj.leetcode.com/problems/word-search/
 *
 * @author Jian Fang (jfang@rocketfuelinc.com)
 */
public class Solution {
    private boolean exist(char[][] board, boolean[][] flags, int row, int col, String word, int start){
        if(row >= 0 && row < board.length && col >= 0 && col < board[row].length && (!flags[row][col]) &&
           start < word.length() && word.charAt(start) == board[row][col]){
            if(start == word.length() - 1){
                return true;
            }
            flags[row][col] = true;
            if(exist(board, flags, row + 1, col, word, start + 1) ||
               exist(board, flags, row - 1, col, word, start + 1) ||
               exist(board, flags, row, col + 1, word, start + 1) ||
               exist(board, flags, row, col - 1, word, start + 1)){
                return true;
            }
            flags[row][col] = false;
        }
        return false;
    }

    public boolean exist(char[][] board, String word) {
        boolean[][] flags = new boolean[board.length][];
        for(int i = 0; i < board.length; i++){
            flags[i] = new boolean[board[i].length];
        }
        for(int i = 0; i < board.length; i++){
            for(int j = 0; j < board[i].length; j++){
                if(exist(board, flags, i, j, word, 0)){
                    return true;
                }
            }
        }
        return false;
    }
}

