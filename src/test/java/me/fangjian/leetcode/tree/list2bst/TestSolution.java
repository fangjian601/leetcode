package me.fangjian.leetcode.tree.list2bst;

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
        TreeNode root = solution.sortedListToBST(head);
        assertEquals(root.val, 2);
        assertEquals(root.left.val, 1);
        assertEquals(root.right.val, 3);

    }
}
