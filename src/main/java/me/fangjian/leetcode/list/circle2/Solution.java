package me.fangjian.leetcode.list.circle2;

/**
 * Created at 7/29/14
 *
 * https://oj.leetcode.com/problems/linked-list-cycle-ii/
 *
 * @author Jian Fang (jfang@rocketfuelinc.com)
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        if(head != null && head.next != null){
            ListNode p1 = head, p2 = head;
            while(p1 != null && p2 != null){
                p1 = p1.next;
                if(p2 != null && p2.next != null){
                    p2 = p2.next.next;
                } else {
                    p2 = null;
                }
                if(p1 == p2){
                    break;
                }
            }
            if(p1 == null || p2 == null){
                return null;
            }
            p1 = head;
            while(p1 != p2){
                p1 = p1.next;
                p2 = p2.next;
            }
            return p1;
        }
        return null;
    }
}
