package me.fangjian.leetcode.list.add2num;

/**
 * Created at 7/16/14
 *
 * https://oj.leetcode.com/problems/add-two-numbers/
 *
 * @author Jian Fang (jfang@rocketfuelinc.com)
 */
public class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode result = null;
        if(l1 != null || l2 != null){
            int forward = 0, v1, v2;
            result = new ListNode(0);
            ListNode p = result, p1 = l1, p2 = l2;
            while(p1 != null || p2 != null){
                v1 = p1 == null ? 0 : p1.val;
                v2 = p2 == null ? 0 : p2.val;
                if(forward + v1 + v2 > 9){
                    p.val = forward + v1 + v2 - 10;
                    forward = 1;
                } else {
                    p.val = forward + v1 + v2;
                    forward = 0;
                }
                if(p1 != null) p1 = p1.next;
                if(p2 != null) p2 = p2.next;
                if(p1 != null || p2 != null){
                    p.next = new ListNode(0);
                    p = p.next;
                }
            }
            if(forward != 0){
                p.next = new ListNode(forward);
            }
        }
        return result;
    }
}
