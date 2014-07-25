package me.fangjian.leetcode.list.add2num;

import org.testng.annotations.Test;
import static org.testng.AssertJUnit.*;

/**
 * Created at 7/16/14
 *
 * @author Jian Fang (jfang@rocketfuelinc.com)
 */
public class TestSolution {
    @Test
    public void testNull(){
        assertEquals(new Solution().addTwoNumbers(null, null), null);
    }

    @Test
    public void testRightNull(){
        ListNode l1 = new ListNode(1);
        l1.next = new ListNode(2);
        ListNode result = new Solution().addTwoNumbers(l1, null);
        assertEquals(result.val, 1);
        assertEquals(result.next.val, 2);
        assertEquals(result.next.next, null);
    }

    @Test
    public void testLeftNull(){
        ListNode l2 = new ListNode(1);
        l2.next = new ListNode(2);
        ListNode result = new Solution().addTwoNumbers(null, l2);
        assertEquals(result.val, 1);
        assertEquals(result.next.val, 2);
        assertEquals(result.next.next, null);
    }

    @Test
    public void testEqualLength(){
        ListNode l1 = new ListNode(7);
        l1.next = new ListNode(8);
        ListNode l2 = new ListNode(6);
        l2.next = new ListNode(5);
        ListNode result = new Solution().addTwoNumbers(l1, l2);
        assertEquals(result.val, 3);
        assertEquals(result.next.val, 4);
        assertEquals(result.next.next.val, 1);
        assertEquals(result.next.next.next, null);
    }

    @Test void testNotEqualLength(){
        ListNode l1 = new ListNode(8);
        l1.next = new ListNode(9);
        ListNode l2 = new ListNode(4);
        ListNode result = new Solution().addTwoNumbers(l1, l2);
        assertEquals(result.val, 2);
        assertEquals(result.next.val, 0);
        assertEquals(result.next.next.val, 1);
        assertEquals(result.next.next.next, null);
    }
}
