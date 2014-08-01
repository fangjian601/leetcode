package me.fangjian.leetcode.list.partitionlist;

/**
 * Created at 7/31/14
 *
 * https://oj.leetcode.com/problems/partition-list/
 *
 * @author Jian Fang (jfang@rocketfuelinc.com)
 */
public class Solution {
    public ListNode partition(ListNode head, int x) {
        ListNode storePos = null, previous = null, ptr = head, newHead = head;
        while(ptr != null){
            if(ptr.val >= x){
                previous = ptr;
                ptr = ptr.next;
            } else{
                if(storePos == previous){
                    storePos = ptr;
                    previous = ptr;
                    ptr = ptr.next;
                } else {
                    ListNode next = ptr.next;
                    previous.next = ptr.next;
                    if(storePos == null){
                        ptr.next = head;
                        newHead = ptr;
                    } else {
                        ptr.next = storePos.next;
                        storePos.next = ptr;
                    }
                    storePos = ptr;
                    ptr = next;
                }

            }
        }
        return newHead;
    }
}
