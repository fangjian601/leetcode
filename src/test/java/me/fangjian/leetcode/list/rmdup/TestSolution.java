package me.fangjian.leetcode.list.rmdup;

import org.testng.annotations.Test;
import static org.testng.AssertJUnit.*;

/**
 * Created at 7/29/14
 *
 * @author Jian Fang (jfang@rocketfuelinc.com)
 */
public class TestSolution {
    @Test
    public void testSolution(){
        Solution solution = new Solution();
        ListNode[] nodes = new ListNode[]{
                new ListNode(1),
                new ListNode(1),
                new ListNode(3)
        };
        nodes[0].next = nodes[1];
        nodes[1].next = nodes[2];
        solution.deleteDuplicates(nodes[0]);
        assertEquals(nodes[0].next, nodes[2]);
    }
}
