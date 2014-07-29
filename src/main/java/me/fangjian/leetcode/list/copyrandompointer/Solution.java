package me.fangjian.leetcode.list.copyrandompointer;

/**
 * Created at 7/28/14
 *
 * https://oj.leetcode.com/problems/copy-list-with-random-pointer/
 *
 * @author Jian Fang (jfang@rocketfuelinc.com)
 */
public class Solution {
    public RandomListNode copyRandomList(RandomListNode head) {
        if(head == null) { return null; }
        RandomListNode newHead = new RandomListNode(head.label);
        RandomListNode tmp, p1 = head, p2 = newHead;
        while(p1 != null){
            tmp = p1.next;
            if(tmp != null){
                p2.next = new RandomListNode(tmp.label);
            }
            p1.next = p2;
            p2.random = p1;
            p1 = tmp;
            p2 = p2.next;
        }
        p1 = head;
        while(p1 != null){
            RandomListNode newRandom = p1.random;
            p2 = p1.next;
            if(newRandom != null) { newRandom = newRandom.next; }
            p1.next.random = newRandom;
            if(p2.next != null){
                p1 = p2.next.random;
            } else {
                p1 = null;
            }
            p2.next = p1;
        }
        p1 = head;
        while(p1 != null){
            tmp = p1.next.next;
            if(tmp == null){
                p1.next.next = null;
            } else {
                p1.next.next = tmp.next;
            }
            p1.next = tmp;
            p1 = tmp;
        }
        return newHead;
    }
}
