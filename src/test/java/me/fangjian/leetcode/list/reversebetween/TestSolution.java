package me.fangjian.leetcode.list.reversebetween;

import org.testng.annotations.Test;
import static org.testng.AssertJUnit.*;

/**
 * Created at 7/31/14
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
        ListNode newHead = solution.reverseBetween(head, 2, 3);
        assertEquals(newHead.val, 1);
        assertEquals(newHead.next.val, 3);
        assertEquals(newHead.next.next.val, 2);
    }
}
