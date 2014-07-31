package me.fangjian.leetcode.tree.pathsum2;

import java.util.ArrayList;
import java.util.List;

/**
 * Created at 7/31/14
 *
 * https://oj.leetcode.com/problems/path-sum-ii/
 *
 * @author Jian Fang (jfang@rocketfuelinc.com)
 */
public class Solution {
    private void pathSum(TreeNode node, int targetSum, int currentSum, List<Integer> path, List<List<Integer>> result){
        if(node != null){
            path.add(node.val);
            if(node.left == null && node.right == null && currentSum + node.val == targetSum){
                result.add(new ArrayList<Integer>(path));
            }
            if(node.left != null){
                pathSum(node.left, targetSum, currentSum + node.val, path, result);
            }
            if(node.right != null){
                pathSum(node.right, targetSum, currentSum + node.val, path, result);
            }
            path.remove(path.size() - 1);
        }
    }

    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        pathSum(root, sum, 0, new ArrayList<Integer>(), result);
        return result;
    }
}
