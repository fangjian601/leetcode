package me.fangjian.leetcode.list.swappairs;

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
                new ListNode(0),
                new ListNode(1),
                new ListNode(2)
        };
        nodes[0].next = nodes[1];
        nodes[1].next = nodes[2];
        ListNode node = solution.swapPairs(nodes[0]);
        assertEquals(node, nodes[1]);
        assertEquals(node.next, nodes[0]);
        assertEquals(node.next.next, nodes[2]);
    }
}
