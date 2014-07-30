package me.fangjian.leetcode.list.mergelists;

import org.testng.annotations.Test;
import static org.testng.AssertJUnit.*;

/**
 * Created at 7/28/14
 *
 * @author Jian Fang (jfang@rocketfuelinc.com)
 */
public class TestSolution {
    @Test
    public void testSolution(){
        assertEquals(new Solution().mergeTwoLists(null, null), null);
    }
}
