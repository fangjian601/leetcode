package me.fangjian.leetcode.matrix.spiralmatrix2;

import org.testng.annotations.Test;
import static org.testng.AssertJUnit.*;


/**
 * Created at 7/16/14
 *
 * @author Jian Fang (jfang@rocketfuelinc.com)
 */
public class TestSolution {

    @Test
    public void testZero(){
        assertArrayEquals(new Solution().generateMatrix(0), new int[0][0]);
    }

    @Test
    public void testOne(){
        assertArrayEquals(new Solution().generateMatrix(1), new int[][]{{1}});
    }

    @Test
    public void testOdd(){
        assertArrayEquals(new Solution().generateMatrix(3), new int[][]{
                {1, 2, 3},
                {8, 9, 4},
                {7, 6, 5}
        });
    }

    @Test
    public void testEven(){
        assertArrayEquals(new Solution().generateMatrix(4), new int[][]{
                {1, 2, 3, 4},
                {12, 13, 14, 5},
                {11, 16, 15, 6},
                {10, 9, 8, 7}
        });
    }
}
