package me.fangjian.leetcode.tree.symtree;

/**
 * Created at 7/29/14
 *
 * https://oj.leetcode.com/problems/symmetric-tree/
 *
 * @author Jian Fang (jfang@rocketfuelinc.com)
 */
public class Solution {
    private boolean isSymmetric(TreeNode a, TreeNode b){
        if(a == null && b == null){
            return true;
        } else if((a == null && b != null) || (a != null && b == null)){
            return false;
        } else {
            return (a.val == b.val) && isSymmetric(a.left, b.right) && isSymmetric(a.right, b.left);
        }
    }

    public boolean isSymmetric(TreeNode root) {
        if(root == null){
            return true;
        }
        return isSymmetric(root.left, root.right);
    }
}
