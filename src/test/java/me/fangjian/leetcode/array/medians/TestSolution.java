package me.fangjian.leetcode.array.medians;

import org.testng.annotations.Test;
import static org.testng.AssertJUnit.*;

/**
 * Created at 7/28/14
 *
 * @author Jian Fang (jfang@rocketfuelinc.com)
 */
public class TestSolution {
    @Test
    public void testMedians(){
        int[] A = new int[]{1};
        int[] B = new int[]{2, 3};
        assertEquals(new Solution().findMedianSortedArrays(A, B), 2.0);
    }

    @Test
    public void testMedians1(){
        int[] A = new int[]{2, 3, 4};
        int[] B = new int[]{1};
        assertEquals(new Solution().findMedianSortedArrays(A, B), 2.5);
    }

    @Test
    public void testMedians2(){
        int[] A = new int[]{1, 2};
        int[] B = new int[]{1, 2, 3};
        assertEquals(new Solution().findMedianSortedArrays(A, B), 2.0);
    }

    @Test
    public void testMedians3(){
        int[] A = new int[]{1, 4, 5, 6};
        int[] B = new int[]{2, 3, 7, 8};
        assertEquals(new Solution().findMedianSortedArrays(A, B), 4.5);
    }

    @Test
    public void testMedians7(){
        int[] A = new int[]{1};
        int[] B = new int[]{2, 3, 4};
        assertEquals(new Solution().findMedianSortedArrays(A, B), 2.5);
    }
}
