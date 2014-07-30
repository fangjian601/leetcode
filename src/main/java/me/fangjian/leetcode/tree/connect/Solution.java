package me.fangjian.leetcode.tree.connect;

/**
 * Created at 7/29/14
 *
 * https://oj.leetcode.com/problems/populating-next-right-pointers-in-each-node/
 *
 * @author Jian Fang (jfang@rocketfuelinc.com)
 */
public class Solution {
    public void connect(TreeLinkNode root) {
        TreeLinkNode parent = null, first = null, current = root;
        boolean isLeft = true;
        while(current != null){
            if(parent == null){
                first = current.left;
                parent = current;
                current = current.left;
            } else if(isLeft){
                current.next = parent.right;
                current = parent.right;
                isLeft = false;
            } else {
                if(parent.next == null){
                    current = first.left;
                    parent = first;
                    first = first.left;
                } else {
                    parent = parent.next;
                    current.next = parent.left;
                    current = parent.left;
                }
                isLeft = true;
            }
        }
    }
}
