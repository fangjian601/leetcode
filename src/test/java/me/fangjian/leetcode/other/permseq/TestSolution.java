package me.fangjian.leetcode.other.permseq;

import org.testng.annotations.Test;
import static org.testng.AssertJUnit.*;

/**
 * Created at 7/28/14
 *
 * @author Jian Fang (jfang@rocketfuelinc.com)
 */
public class TestSolution {
    @Test
    public void testThree(){
        assertEquals(new Solution().getPermutation(3, 2), "132");
    }
}
