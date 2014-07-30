package me.fangjian.leetcode.list.mergelists;

/**
 * Created at 7/28/14
 *
 * https://oj.leetcode.com/problems/merge-two-sorted-lists/
 *
 * @author Jian Fang (jfang@rocketfuelinc.com)
 */
public class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode l1Last = null, l1Current = l1, l2Current = l2;
        ListNode tmp, newHead = l1;
        while(l1Current != null && l2Current != null){
            if(l1Current.val < l2Current.val){
                l1Last = l1Current;
                l1Current = l1Current.next;
            } else {
                tmp = l2Current.next;
                if(l1Last == null){
                    newHead = l2Current;
                } else {
                    l1Last.next = l2Current;
                }
                l2Current.next = l1Current;
                l1Last = l2Current;
                l2Current = tmp;
            }
        }
        if(l2Current != null){
            if(l1Last == null){
                newHead = l2;
            } else {
                l1Last.next = l2Current;
            }
        }
        return newHead;
    }
}
