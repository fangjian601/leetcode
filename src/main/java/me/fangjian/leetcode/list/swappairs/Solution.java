package me.fangjian.leetcode.list.swappairs;

/**
 * Created at 7/29/14
 *
 * @author Jian Fang (jfang@rocketfuelinc.com)
 */
public class Solution {
    public ListNode swapPairs(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }
        ListNode p0 = null, p1 = head, p2 = head.next, p3 = head.next.next, newHead = head;
        while(p1 != null && p2 != null){
            if(p0 != null){
                p0.next = p2;
            } else {
                newHead = p2;
            }
            p2.next = p1;
            p1.next = p3;
            p0 = p1;
            p1 = p3;
            if(p3 != null) p2 = p3.next;
            else p2 = null;
            if(p2 != null) p3 = p2.next;
        }
        return newHead;
    }
}
