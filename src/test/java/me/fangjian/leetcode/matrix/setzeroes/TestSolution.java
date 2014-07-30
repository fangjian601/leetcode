package me.fangjian.leetcode.matrix.setzeroes;

import org.testng.annotations.Test;
import static org.testng.AssertJUnit.*;

/**
 * Created at 7/30/14
 *
 * @author Jian Fang (jfang@rocketfuelinc.com)
 */
public class TestSolution {
    @Test
    public void testSolution() {
        Solution solution = new Solution();
        int[][] matrix = new int[][]{
                {1, 2, 3},
                {2, 0, 1},
                {0, 1, 1}
        };
        int[][] expected = new int[][]{
                {0, 0, 3},
                {0, 0, 0},
                {0, 0, 0}
        };
        solution.setZeroes(matrix);
        assertArrayEquals(matrix[0], expected[0]);
        assertArrayEquals(matrix[1], expected[1]);
        assertArrayEquals(matrix[2], expected[2]);
    }
}
