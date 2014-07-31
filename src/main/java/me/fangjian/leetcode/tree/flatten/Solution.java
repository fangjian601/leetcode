package me.fangjian.leetcode.tree.flatten;

/**
 * Created at 7/30/14
 *
 * https://oj.leetcode.com/problems/flatten-binary-tree-to-linked-list/
 *
 * @author Jian Fang (jfang@rocketfuelinc.com)
 */
public class Solution {
    public void flatten(TreeNode root) {
        TreeNode current = root;
        while(current != null){
            if(current.left == null){
                current = current.right;
            } else {
                TreeNode p = current.left;
                while(p.right != null){
                    p = p.right;
                }
                p.right = current.right;
                current.right = current.left;
                current.left = null;
                current = current.right;
            }
        }
    }
}
