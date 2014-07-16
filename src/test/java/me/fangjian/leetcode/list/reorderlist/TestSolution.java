package me.fangjian.leetcode.list.reorderlist;

import org.testng.annotations.Test;
import static org.testng.AssertJUnit.*;

/**
 * Created at 7/15/14
 *
 * @author Jian Fang (jfang@rocketfuelinc.com)
 */
public class TestSolution {
    @Test
    public void testSingleNode(){
        ListNode head = new ListNode(1);
        new Solution().reorderList(head);
        assertEquals(head.val, 1);
    }

    @Test
    public void testTwoNodes(){
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        new Solution().reorderList(head);
        assertEquals(head.val, 1);
        assertEquals(head.next.val, 2);
    }

    @Test
    public void testEvenNodes(){
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        new Solution().reorderList(head);
        assertEquals(head.val, 1);
        assertEquals(head.next.val, 4);
        assertEquals(head.next.next.val, 2);
        assertEquals(head.next.next.next.val, 3);
    }

    @Test
    public void testOddNodes(){
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        new Solution().reorderList(head);
        assertEquals(head.val, 1);
        assertEquals(head.next.val, 5);
        assertEquals(head.next.next.val, 2);
        assertEquals(head.next.next.next.val, 4);
        assertEquals(head.next.next.next.next.val, 3);
    }
}
