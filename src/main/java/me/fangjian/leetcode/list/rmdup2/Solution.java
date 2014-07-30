package me.fangjian.leetcode.list.rmdup2;

/**
 * Created at 7/28/14
 *
 * @author Jian Fang (jfang@rocketfuelinc.com)
 */
public class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }
        ListNode p0 = null, p1 = head, p2 = head.next;
        while(p2 != null){
            if(p1.val == p2.val){
                p1.next = p2.next;
                p2.next = null;
                p2 = p1.next;
                if(p2 == null || p2.val != p1.val){
                    if(p0 != null){
                        p0.next = p2;
                    } else {
                        head = p2;
                    }
                    p1.next = null;
                    p1 = p2;
                    if(p2 != null) p2 = p2.next;
                }
            } else {
                p0 = p1;
                p1 = p2;
                p2 = p2.next;
            }
        }
        return head;
    }
}
