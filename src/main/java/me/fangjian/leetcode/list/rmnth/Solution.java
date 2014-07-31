package me.fangjian.leetcode.list.rmnth;

/**
 * Created at 7/30/14
 *
 * https://oj.leetcode.com/problems/remove-nth-node-from-end-of-list/
 *
 * @author Jian Fang (jfang@rocketfuelinc.com)
 */
public class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode p0 = null, p1 = head, p2 = head, newHead = head;
        int index = 0;
        while(p1 != null && p2 != null){
            if(index >= n){
                p0 = p1;
                p1 = p1.next;
            }
            p2 = p2.next;
            index++;
        }
        if(index >= n){
            if(p0 == null){
                newHead = p1.next;
                p1.next = null;
            } else{
                p0.next = p1.next;
                p1.next = null;
            }
        }
        return newHead;
    }
}
