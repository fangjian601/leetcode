package me.fangjian.leetcode.tree.maxdepth;

/**
 * Created at 7/29/14
 *
 * https://oj.leetcode.com/problems/maximum-depth-of-binary-tree/
 *
 * @author Jian Fang (jfang@rocketfuelinc.com)
 */
public class Solution {
    public int maxDepth(TreeNode root) {
        if(root == null){
            return 0;
        } else {
            return Math.max(maxDepth(root.left), maxDepth(root.right)) + 1;
        }
    }
}
