package me.fangjian.leetcode.tree.sametree;

/**
 * Created at 7/29/14
 *
 * https://oj.leetcode.com/problems/same-tree/
 *
 * @author Jian Fang (jfang@rocketfuelinc.com)
 */
public class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p == null && q == null){
            return true;
        } else if(p == null && q != null){
            return false;
        } else if(p != null && q == null){
            return false;
        } else {
            return (p.val == q.val) && isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
        }
    }
}
