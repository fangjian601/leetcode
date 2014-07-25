package me.fangjian.leetcode.other.generateparentheses;

import org.testng.annotations.Test;

import java.util.List;

import static org.testng.AssertJUnit.*;

/**
 * Created at 7/24/14
 *
 * @author Jian Fang (jfang@rocketfuelinc.com)
 */
public class TestSolution {
    @Test
    public void testEmpty(){
        assert new Solution().generateParenthesis(0).isEmpty();
    }

    @Test
    public void testOne(){
        List<String> result =  new Solution().generateParenthesis(1);
        assertEquals(result.size(), 1);
        assertEquals(result.get(0), "()");
    }

    @Test
    public void testTwo(){
        List<String> result =  new Solution().generateParenthesis(2);
        assertEquals(result.size(), 2);
        assertEquals(result.get(0), "(())");
        assertEquals(result.get(1), "()()");
    }
}
