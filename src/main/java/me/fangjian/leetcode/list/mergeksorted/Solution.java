package me.fangjian.leetcode.list.mergeksorted;

import java.util.List;

/**
 * Created at 8/1/14
 *
 * https://oj.leetcode.com/problems/merge-k-sorted-lists/
 *
 * @author Jian Fang (jfang@rocketfuelinc.com)
 */
public class Solution {
    public ListNode mergeTwoList(ListNode list1, ListNode list2){
        ListNode newHead = null, newTail = null, p1 = list1, p2 = list2;
        while(p1 != null || p2 != null){
            if(p1 != null && p2 != null){
                ListNode newNode = p1.val < p2.val ? p1 : p2;
                ListNode p1Next = p1.next, p2Next = p2.next;
                newNode.next = null;
                if(newHead == null){
                    newHead = newNode;
                    newTail = newNode;
                } else {
                    newTail.next = newNode;
                    newTail = newNode;
                }
                if(p1.val < p2.val){
                    p1 = p1Next;
                } else {
                    p2 = p2Next;
                }
            } else if(p1 != null && p2 == null){
                if(newHead == null){
                    newHead = p1;
                } else {
                    newTail.next = p1;
                }
                break;
            } else{
                if(newHead == null){
                    newHead = p2;
                } else {
                    newTail.next = p2;
                }
                break;
            }
        }
        return newHead;
    }

    public ListNode mergeKLists(List<ListNode> lists) {
        if(lists.size() == 0) { return null; }
        ListNode merged = lists.get(0);
        for(int i = 1; i < lists.size(); i++){
            merged = mergeTwoList(merged, lists.get(i));
        }
        return merged;
    }
}
