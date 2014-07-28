package me.fangjian.leetcode.matrix.rotate;

import org.testng.annotations.Test;
import static org.testng.AssertJUnit.*;

/**
 * Created at 7/25/14
 *
 * @author Jian Fang (jfang@rocketfuelinc.com)
 */
public class TestSolution {
    @Test
    public void testTwo(){
        int[][] matrix = new int[][]{{1, 2}, {3, 4}};
        new Solution().rotate(matrix);
        assertArrayEquals(matrix[0], new int[]{3, 1});
        assertArrayEquals(matrix[1], new int[]{4, 2});
    }

    @Test
    public void testThree(){
        int[][] matrix = new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        new Solution().rotate(matrix);
        assertArrayEquals(matrix[0], new int[]{7, 4, 1});
        assertArrayEquals(matrix[1], new int[]{8, 5, 2});
        assertArrayEquals(matrix[2], new int[]{9, 6, 3});
    }
}
