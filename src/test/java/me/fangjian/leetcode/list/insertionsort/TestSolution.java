package me.fangjian.leetcode.list.insertionsort;

import org.testng.annotations.Test;
import static org.testng.AssertJUnit.*;

/**
 * Created at 7/31/14
 *
 * @author Jian Fang (jfang@rocketfuelinc.com)
 */
public class TestSolution {
    @Test
    public void testSolution(){
        Solution solution = new Solution();
        ListNode head = new ListNode(1);
        head.next = new ListNode(3);
        head.next.next = new ListNode(2);
        ListNode newHead = solution.insertionSortList(head);
        assertEquals(newHead.val, 1);
        assertEquals(newHead.next.val, 2);
        assertEquals(newHead.next.next.val, 3);
    }
}
