package me.fangjian.leetcode.matrix.spiralmatrix;

import org.testng.annotations.Test;

import java.util.List;

import static org.testng.AssertJUnit.*;

/**
 * Created at 7/28/14
 *
 * @author Jian Fang (jfang@rocketfuelinc.com)
 */
public class TestSolution {
    @Test
    public void testOne(){
        List<Integer> result = new Solution().spiralOrder(new int[][]{{1}});
        assertEquals(result.size(), 1);
        assertEquals(result.get(0), new Integer(1));
    }

    @Test
    public void testOneRow(){
        List<Integer> result = new Solution().spiralOrder(new int[][]{{1, 2, 3}});
        assertEquals(result.size(), 3);
        assertEquals(result.get(0), new Integer(1));
        assertEquals(result.get(1), new Integer(2));
        assertEquals(result.get(2), new Integer(3));
    }

    @Test
    public void testRect(){
        List<Integer> result = new Solution().spiralOrder(new int[][]{
                {1, 2, 3},
                {4, 5, 6}
        });
        assertEquals(result.size(), 6);
        assertEquals(result.get(0), new Integer(1));
        assertEquals(result.get(1), new Integer(2));
        assertEquals(result.get(2), new Integer(3));
        assertEquals(result.get(3), new Integer(6));
        assertEquals(result.get(4), new Integer(5));
        assertEquals(result.get(5), new Integer(4));
    }

    @Test
    public void testOdd(){
        List<Integer> result = new Solution().spiralOrder(new int[][]{
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        });
        assertEquals(result.size(), 9);
        assertEquals(result.get(0), new Integer(1));
        assertEquals(result.get(1), new Integer(2));
        assertEquals(result.get(2), new Integer(3));
        assertEquals(result.get(3), new Integer(6));
        assertEquals(result.get(4), new Integer(9));
        assertEquals(result.get(5), new Integer(8));
        assertEquals(result.get(6), new Integer(7));
        assertEquals(result.get(7), new Integer(4));
        assertEquals(result.get(8), new Integer(5));
    }

    @Test
    public void testEven(){
        List<Integer> result = new Solution().spiralOrder(new int[][]{
                {1, 2},
                {3, 4}
        });
        assertEquals(result.size(), 4);
        assertEquals(result.get(0), new Integer(1));
        assertEquals(result.get(1), new Integer(2));
        assertEquals(result.get(2), new Integer(4));
        assertEquals(result.get(3), new Integer(3));
    }
}
