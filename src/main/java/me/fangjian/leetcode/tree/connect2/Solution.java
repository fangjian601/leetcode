package me.fangjian.leetcode.tree.connect2;

/**
 * Created at 7/30/14
 *
 * https://oj.leetcode.com/problems/populating-next-right-pointers-in-each-node-ii/
 *
 * @author Jian Fang (jfang@rocketfuelinc.com)
 */
public class Solution {
    public void connect(TreeLinkNode root) {
        TreeLinkNode nextHead = null, nextParent = null, current = root, parent = null;
        boolean isLeft = true, isNextLeft = true;
        while(current != null){
            if(parent == null){
                parent = current;
                if(current.left != null) {
                    current = current.left;
                    isLeft = true;
                }
                else {
                    current = current.right;
                    isLeft = false;
                }
            } else{
                if(nextHead == null){
                    nextParent = current;
                    if(current.left != null){
                        nextHead = current.left;
                        isNextLeft = true;
                    }
                    else {
                        nextHead = current.right;
                        isNextLeft = false;
                    }
                }
                TreeLinkNode next = null;
                if(isLeft && parent.right != null){
                    next = parent.right;
                    isLeft = false;
                } else {
                    parent = parent.next;
                    while(parent != null){
                        if(parent.left != null){
                            next = parent.left;
                            isLeft = true;
                            break;
                        } else if(parent.right != null){
                            next = parent.right;
                            isLeft = false;
                            break;
                        } else {
                            parent = parent.next;
                        }
                    }
                }
                if(next != null){
                    current.next = next;
                    current = next;
                } else {
                    parent = nextParent;
                    current = nextHead;
                    isLeft = isNextLeft;
                    nextHead = null;
                    nextParent = null;
                }
            }
        }
    }
}
