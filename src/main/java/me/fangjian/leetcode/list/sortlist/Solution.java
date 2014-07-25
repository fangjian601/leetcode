package me.fangjian.leetcode.list.sortlist;

/**
 * Created at 7/24/14
 *
 * https://oj.leetcode.com/problems/sort-list/
 *
 * @author Jian Fang (jfang@rocketfuelinc.com)
 */
public class Solution {

    private ListNode merge(ListNode preStart1, ListNode start1, ListNode end1,
                           ListNode preStart2, ListNode start2, ListNode end2){
        ListNode pre1 = preStart1, pre2 = preStart2, p1 = start1, p2 = start2;
        while(p1 != null && p2 != null){
            if(p1.val < p2.val){
                if(p1 == end1) break;
                pre1 = p1;
                p1 = p1.next;
            } else {
                //Delete Node
                ListNode next = p2.next;
                if(pre2 != null) pre2.next = p2.next;

                //Insert Node
                p2.next = p1;
                if(pre1 != null) pre1.next = p2;

                //Head changed?
                if(p1 == start1) start1 = p2;

                //Finished?
                if(p2 == end2) break;

                //Iteration
                pre1 = p2;
                p2 = next;
            }
        }
        return start1;
    }

    private ListNode nextN(ListNode node, int n){
        ListNode p = node;
        while(n != 0 && p != null){
            p = p.next;
            n--;
        }
        return p;
    }

    public ListNode sortList(ListNode head){
        if(head != null){
            ListNode preStart1 = null, start1 = head, end1 = head;
            ListNode preStart2 = head, start2 = head.next, end2 = head.next;
            int pace = 1;
            while(start2 != null){
                while(start2 != null){
                    ListNode merged = merge(preStart1, start1, end1, preStart2, start2, end2);
                    if(start1 == head) head = merged;

                    preStart1 = nextN(merged, (pace << 1) - 1);
                    start1 = preStart1 == null ? null : preStart1.next;
                    end1 = nextN(start1, pace - 1);

                    preStart2 = end1;
                    start2 = preStart2 == null ? null : preStart2.next;
                    end2 = nextN(start2, pace - 1);
                }
                pace <<= 1;
                preStart1 = null;
                start1 = head;
                end1 = nextN(start1, pace - 1);

                preStart2 = end1;
                start2 = preStart2 == null ? null : preStart2.next;
                end2 = nextN(start2, pace - 1);
            }
        }
        return head;
    }
}
