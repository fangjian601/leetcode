package me.fangjian.leetcode.list.rmdup;

/**
 * Created at 7/29/14
 *
 * https://oj.leetcode.com/problems/remove-duplicates-from-sorted-list/
 *
 * @author Jian Fang (jfang@rocketfuelinc.com)
 */
public class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }
        ListNode tmp, p1 = head, p2 = head.next;
        while(p2 != null){
            if(p1.val == p2.val){
                tmp = p2.next;
                p1.next = tmp;
                p2.next = null;
                p2 = tmp;
            } else {
                p1 = p1.next;
                p2 = p2.next;
            }
        }
        return head;
    }
}
