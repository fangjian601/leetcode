package me.fangjian.leetcode.string.validparentheses;

import org.testng.annotations.Test;
import static org.testng.AssertJUnit.*;

/**
 * Created at 7/30/14
 *
 * @author Jian Fang (jfang@rocketfuelinc.com)
 */
public class TestSolution {
    @Test
    public void testSolution(){
        Solution solution = new Solution();
        assertEquals(solution.isValid("(){}[]"), true);
        assertEquals(solution.isValid("[[}}"), false);
    }
}
