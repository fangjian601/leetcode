package me.fangjian.leetcode.tree.btreemaxpathsum;

import java.util.Stack;

/**
 * Created at 7/16/14
 *
 * https://oj.leetcode.com/problems/binary-tree-maximum-path-sum/
 *
 * @author Jian Fang (jfang@rocketfuelinc.com)
 */
public class Solution {

    class SumTreeNode{
        int val = 0;
        int leftSum = 0;
        int rightSum = 0;
        SumTreeNode left = null;
        SumTreeNode right = null;
        public SumTreeNode(int val){
            this.val = val;
        }
    }

    private SumTreeNode calcSums(TreeNode root){
        SumTreeNode result = new SumTreeNode(root.val);
        int sum;
        if(root.left != null){
            result.left = calcSums(root.left);
            sum = Math.max(result.left.leftSum, result.left.rightSum);
            if(sum > 0) {
                result.leftSum = sum + result.left.val;
            } else {
                result.leftSum = result.left.val;
            }
        }
        if(root.right != null){
            result.right = calcSums(root.right);
            sum = Math.max(result.right.leftSum, result.right.rightSum);
            if(sum > 0) {
                result.rightSum = sum + result.right.val;
            } else {
                result.rightSum = result.right.val;
            }
        }
        return result;
    }

    public int maxPathSum(TreeNode root) {
        if(root != null){
            int sum, maxSum = Integer.MIN_VALUE;
            Stack<SumTreeNode> stack = new Stack<SumTreeNode>();
            SumTreeNode sumRoot = calcSums(root);
            stack.push(sumRoot);
            while(!stack.isEmpty()){
                SumTreeNode sumNode = stack.pop();
                sum = sumNode.val;
                if(sumNode.leftSum > 0) sum += sumNode.leftSum;
                if(sumNode.rightSum > 0) sum += sumNode.rightSum;
                maxSum = Math.max(maxSum, sum);
                if(sumNode.left != null)stack.push(sumNode.left);
                if(sumNode.right != null)stack.push(sumNode.right);
            }
            return maxSum;
        }
        return 0;
    }
}
