package me.fangjian.leetcode.array.singlenumber;

import org.testng.annotations.Test;
import static org.testng.AssertJUnit.*;

/**
 * Created at 7/28/14
 *
 * @author Jian Fang (jfang@rocketfuelinc.com)
 */
public class TestSolution {
    @Test
    public void testArray(){
        assertEquals(new Solution().singleNumber(new int[]{2, 2, 3}), 3);
    }
}
