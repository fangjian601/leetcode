package me.fangjian.leetcode.list.reversekgroup;

/**
 * Created at 8/1/14
 *
 * https://oj.leetcode.com/problems/reverse-nodes-in-k-group/
 *
 * @author Jian Fang (jfang@rocketfuelinc.com)
 */
public class Solution {
    private void reverseList(ListNode before, ListNode start, ListNode end){
        if(start != end){
            ListNode after = end.next;
            ListNode p1 = start, p2 = start.next, p3 = start.next.next;
            while(p1 != end){
                p2.next = p1;
                p1 = p2;
                p2 = p3;
                if(p3 != null) { p3 = p3.next; }
            }
            start.next = after;
            if(before != null){
                before.next = end;
            }
        }
    }

    public ListNode reverseKGroup(ListNode head, int k) {
        if(k < 2) { return head; }
        ListNode before = null, p1 = head, p2 = head, newHead = head;
        int index = 0;
        while(p2 != null){
            if((index + 1) % k == 0){
                ListNode next = p2.next;
                reverseList(before, p1, p2);
                if(p1 == head){
                    newHead = p2;
                }
                before = p1;
                p1 = next;
                p2 = next;
            } else {
                p2 = p2.next;
            }
            index++;
        }
        return newHead;
    }
}
