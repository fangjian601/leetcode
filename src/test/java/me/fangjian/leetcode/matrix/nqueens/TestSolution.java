package me.fangjian.leetcode.matrix.nqueens;

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
        assertEquals(solution.solveNQueens(1).size(), 1);
        assertEquals(solution.solveNQueens(2).size(), 0);
    }
}
