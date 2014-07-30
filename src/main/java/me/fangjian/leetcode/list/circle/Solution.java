package me.fangjian.leetcode.list.circle;

/**
 * Created at 7/29/14
 *
 * https://oj.leetcode.com/problems/linked-list-cycle/
 *
 * @author Jian Fang (jfang@rocketfuelinc.com)
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        if(head != null && head.next != null){
            ListNode p1 = head, p2 = head.next.next;
            while(p1 != null){
                if(p1 == p2){
                    return true;
                }
                p1 = p1.next;
                if(p2 != null && p2.next != null){
                    p2 = p2.next.next;
                } else {
                    p2 = null;
                }
            }
        }
        return false;
    }
}
