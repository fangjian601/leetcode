package me.fangjian.leetcode.other.num2roman;

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
        Solution solution = new Solution();
        assertEquals(solution.intToRoman(199), "CXCIX");
        assertEquals(solution.intToRoman(400), "CD");
        assertEquals(solution.intToRoman(1900), "MCM");
        assertEquals(solution.intToRoman(1), "I");
    }
}
