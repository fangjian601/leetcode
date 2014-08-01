package me.fangjian.leetcode.list.reversekgroup;

import org.testng.annotations.Test;
import static org.testng.AssertJUnit.*;

/**
 * Created at 8/1/14
 *
 * @author Jian Fang (jfang@rocketfuelinc.com)
 */
public class TestSolution {
    @Test
    public void testSolution() {
        Solution solution = new Solution();
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        ListNode newHead = solution.reverseKGroup(head, 2);
        assertEquals(newHead.val, 2);
        assertEquals(newHead.next.val, 1);
        assertEquals(newHead.next.next.val, 3);
    }
}
