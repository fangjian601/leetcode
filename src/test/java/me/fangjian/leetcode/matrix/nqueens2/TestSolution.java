package me.fangjian.leetcode.matrix.nqueens2;

import org.testng.annotations.Test;
import static org.testng.AssertJUnit.*;

/**
 * Created at 7/29/14
 *
 * @author Jian Fang (jfang@rocketfuelinc.com)
 */
public class TestSolution{
    @Test
    public void testSolution(){
        Solution solution = new Solution();
        assertEquals(solution.totalNQueens(1), 1);
        assertEquals(solution.totalNQueens(2), 0);
    }
}