package me.fangjian.leetcode.list.mergeksorted;


import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;

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
        ListNode head1 = new ListNode(1);
        head1.next = new ListNode(2);

        ListNode head2 = new ListNode(3);
        head2.next = new ListNode(4);

        ListNode head3 = new ListNode(5);
        head3.next = new ListNode(6);

        List<ListNode> lists = Arrays.asList(new ListNode[]{head1, head2, head3});
        ListNode newHead = solution.mergeKLists(lists);

        assertEquals(newHead.val, 1);
        assertEquals(newHead.next.val, 2);
        assertEquals(newHead.next.next.val, 3);
        assertEquals(newHead.next.next.next.val, 4);
        assertEquals(newHead.next.next.next.next.val, 5);
        assertEquals(newHead.next.next.next.next.next.val, 6);
    }
}
