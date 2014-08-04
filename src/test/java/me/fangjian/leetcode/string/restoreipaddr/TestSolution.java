package me.fangjian.leetcode.string.restoreipaddr;

import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.testng.AssertJUnit.*;

/**
 * Created at 8/3/14
 *
 * @author Jian Fang (jfang@rocketfuelinc.com)
 */
public class TestSolution {
    @Test
    public void testSolution() {
        Solution solution = new Solution();
        List<String> expected =Arrays.asList("0.10.0.10","0.100.1.0");
        List<String> actual = solution.restoreIpAddresses("010010");
        Collections.sort(expected);
        Collections.sort(actual);
        assertEquals(actual, expected);
    }
}
