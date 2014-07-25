package me.fangjian.leetcode.list.sortlist;

import org.testng.annotations.Test;
import static org.testng.AssertJUnit.*;

/**
 * Created at 7/25/14
 *
 * @author Jian Fang (jfang@rocketfuelinc.com)
 */
public class TestSolution {
    @Test
    public void testNull(){
        assertEquals(new Solution().sortList(null), null);
    }

    @Test
    public void testSingleNode(){
        ListNode head = new ListNode(1);
        ListNode sorted = new Solution().sortList(head);
        assertEquals(sorted.val, head.val);
        assertEquals(sorted.next, null);
    }

    @Test
    public void testTwoNode(){
        ListNode head = new ListNode(2);
        head.next = new ListNode(1);
        ListNode sorted = new Solution().sortList(head);
        assertEquals(sorted.val, 1);
        assertEquals(sorted.next.val, 2);
        assertEquals(sorted.next.next, null);
    }

    @Test
    public void testMultipleNodes(){
        ListNode head = new ListNode(3);
        head.next = new ListNode(4);
        head.next.next = new ListNode(1);
        ListNode sorted = new Solution().sortList(head);
        assertEquals(sorted.val, 1);
        assertEquals(sorted.next.val, 3);
        assertEquals(sorted.next.next.val, 4);
        assertEquals(sorted.next.next.next, null);
    }
}
