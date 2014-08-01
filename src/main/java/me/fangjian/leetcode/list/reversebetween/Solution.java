package me.fangjian.leetcode.list.reversebetween;

/**
 * Created at 7/31/14
 *
 * https://oj.leetcode.com/problems/reverse-linked-list-ii/
 *
 * @author Jian Fang (jfang@rocketfuelinc.com)
 */
public class Solution {
    public ListNode reverseBetween(ListNode head, int m, int n) {
        if(head == null || head.next == null){
            return head;
        }
        ListNode startLast = null, start = null, p1 = head, p2 = head.next, p3 = head.next.next, newHead = head;
        int index = 0;
        while(p2 != null && index < n - 1){
            if(index == m - 2){
                startLast = p1;
            } else if(index >= m - 1){
                if(index == m - 1){
                    start = p1;
                }
                p2.next = p1;
            }
            p1 = p2;
            p2 = p3;
            if(p3 != null) { p3 = p3.next; }
            index++;
        }
        if(m == 1){
            newHead = p1;
        }
        if(startLast != null && start != null){
            startLast.next = p1;
        }
        if(start != null){
            start.next = p2;
        }
        return newHead;
    }
}
