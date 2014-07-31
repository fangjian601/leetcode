package me.fangjian.leetcode.matrix.validsudoku;

import org.testng.annotations.Test;
import static org.testng.AssertJUnit.*;

/**
 * Created at 7/30/14
 *
 * @author Jian Fang (jfang@rocketfuelinc.com)
 */
public class TestSolution {
    @Test
    public void testSolution(){
        Solution solution = new Solution();
        String[] boardStr = new String[]{
                "..5.....6",
                "....14...",
                ".........",
                ".....92..",
                "5....2...",
                ".......3.",
                "...54....",
                "3.....42.",
                "...27.6.."
        };
        char[][] board = new char[boardStr.length][boardStr.length];
        for(int i = 0; i < board.length; i++){
            for(int j = 0; j < board[i].length; j++){
                board[i][j] = boardStr[i].charAt(j);
            }
        }
        assertEquals(solution.isValidSudoku(board), true);
    }
}
