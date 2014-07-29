package me.fangjian.leetcode.tree.pathsum;

/**
 * Created at 7/28/14
 *
 * https://oj.leetcode.com/problems/path-sum/
 *
 * @author Jian Fang (jfang@rocketfuelinc.com)
 */
public class Solution {
    private boolean hasPathSum(TreeNode root, int currentSum, int targetSum){
        boolean hasPath = false;
        if(root.left == null && root.right == null){
            hasPath = currentSum + root.val == targetSum;
        }
        if(root.left != null){
            hasPath = hasPathSum(root.left, currentSum + root.val, targetSum);
        }
        if(!hasPath && root.right != null){
            hasPath = hasPathSum(root.right, currentSum + root.val, targetSum);
        }
        return hasPath;
    }

    public boolean hasPathSum(TreeNode root, int sum) {
        return root != null && hasPathSum(root, 0, sum);
    }
}
