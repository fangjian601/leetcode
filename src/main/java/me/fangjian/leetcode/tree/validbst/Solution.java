package me.fangjian.leetcode.tree.validbst;

/**
 * Created at 7/31/14
 *
 * https://oj.leetcode.com/problems/validate-binary-search-tree/
 *
 * @author Jian Fang (jfang@rocketfuelinc.com)
 */
public class Solution {
    private boolean isValidBST(TreeNode root, Integer upperBound, Integer lowerBound){
        if(root == null) { return true; }
        if(upperBound != null && root.val >= upperBound) { return false; }
        if(lowerBound != null && root.val <= lowerBound) { return false; }
        return isValidBST(root.left, root.val, lowerBound) && isValidBST(root.right, upperBound, root.val);
    }

    public boolean isValidBST(TreeNode root) {
        return isValidBST(root, null, null);
    }
}
