package me.fangjian.leetcode.tree.list2bst;

/**
 * Created at 7/31/14
 *
 * https://oj.leetcode.com/problems/convert-sorted-list-to-binary-search-tree/
 *
 * @author Jian Fang (jfang@rocketfuelinc.com)
 */
public class Solution {

    private class Pointer{
        TreeNode treeNode;
        ListNode listHead;
        public Pointer(TreeNode node1, ListNode node2){
            treeNode = node1;
            listHead = node2;
        }
    }

    private int listLength(ListNode head){
        int len = 0;
        while(head != null){
            len++;
            head = head.next;
        }
        return len;
    }

    private Pointer sortedListToBST(ListNode head, int start, int end){
        int len = (end - start) + 1;
        if(len == 0){
            return new Pointer(null, head);
        }
        int mid = start + len / 2;
        TreeNode left = null, root = null, right = null;
        if(mid != start){
            Pointer leftPointer = sortedListToBST(head, start, mid - 1);
            left = leftPointer.treeNode;
            head = leftPointer.listHead;
        }
        root = new TreeNode(head.val);
        head = head.next;
        if(mid != end){
            Pointer rightPointer = sortedListToBST(head, mid + 1, end);
            right = rightPointer.treeNode;
            head = rightPointer.listHead;
        }
        root.left = left;
        root.right = right;
        return new Pointer(root, head);
    }

    public TreeNode sortedListToBST(ListNode head) {
        return sortedListToBST(head, 0, listLength(head) - 1).treeNode;
    }
}
