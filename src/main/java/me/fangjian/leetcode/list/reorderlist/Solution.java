package me.fangjian.leetcode.list.reorderlist;

/**
 * Created at 7/15/14
 *
 * https://oj.leetcode.com/problems/reorder-list/
 *
 * @author Jian Fang (jfang@rocketfuelinc.com)
 */
public class Solution {

    private ListNode reverseList(ListNode head){
        if(head != null && head.next != null){
            ListNode first = head;
            ListNode second = head.next;
            ListNode third = head.next.next;
            first.next = null;
            while(second != null){
                second.next = first;
                first = second;
                second = third;
                if(third != null){
                    third = third.next;
                }
            }
            return first;
        }
        return head;
    }

    private int listSize(ListNode head){
        int i = 0;
        ListNode ptr = head;
        while(ptr != null){
            i++;
            ptr = ptr.next;
        }
        return i;
    }

    private ListNode splitList(ListNode head){
        int size = listSize(head);
        int index = size % 2 == 0 ? size / 2 : size / 2 + 1;
        ListNode tmp, second = head;
        while(index != 0){
            tmp = second.next;
            if(index == 1){
                second.next = null;
            }
            second = tmp;
            index--;
        }
        return second;
    }

    public void reorderList(ListNode head) {
        if(head != null && head.next != null && head.next.next != null){
            ListNode reversedSecond = reverseList(splitList(head));
            ListNode first1 = head;
            ListNode first2 = head.next;
            ListNode second1 = reversedSecond;
            ListNode second2 = reversedSecond.next;
            while(second1 != null){
                first1.next = second1;
                second1.next = first2;
                first1 = first2;
                first2 = first2 == null ? null : first2.next;
                second1 = second2;
                second2 = second2 == null ? null : second2.next;
            }
        }
    }
}
