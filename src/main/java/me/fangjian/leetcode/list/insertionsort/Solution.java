package me.fangjian.leetcode.list.insertionsort;

/**
 * Created at 7/31/14
 *
 * https://oj.leetcode.com/problems/insertion-sort-list/
 *
 * @author Jian Fang (jfang@rocketfuelinc.com)
 */
public class Solution {
    public ListNode insertionSortList(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }
        ListNode p = head.next, newHead = head, newTail = head;
        head.next = null;
        while(p != null){
            ListNode next = p.next;
            if(p.val < newHead.val){
                p.next = newHead;
                newHead = p;
            } else if(p.val >= newTail.val){
                newTail.next = p;
                newTail = p;
                p.next = null;
            } else {
                ListNode insertAfter = newHead;
                while(insertAfter.next.val < p.val){
                    insertAfter = insertAfter.next;
                }
                p.next = insertAfter.next;
                insertAfter.next = p;
            }
            p = next;
        }
        return newHead;
    }
}
