package me.fangjian.leetcode.tree.uniquebsts2;

import java.util.ArrayList;
import java.util.List;

/**
 * Created at 7/31/14
 *
 * https://oj.leetcode.com/problems/unique-binary-search-trees-ii/
 *
 * @author Jian Fang (jfang@rocketfuelinc.com)
 */
public class Solution {
    private List<TreeNode> generateTrees(int start, int end){
        int len = (end - start) + 1;
        List<TreeNode> result = new ArrayList<TreeNode>();
        if(len != 0){
            for(int mid = start; mid <= end; mid++){
                List<TreeNode> leftTrees = generateTrees(start, mid - 1);
                List<TreeNode> rightTrees = generateTrees(mid + 1, end);
                for(TreeNode leftTree : leftTrees){
                    for(TreeNode rightTree : rightTrees){
                        TreeNode root = new TreeNode(mid);
                        root.left = leftTree;
                        root.right = rightTree;
                        result.add(root);
                    }
                }
            }

        } else {
            result.add(null);
        }
        return result;
    }

    public List<TreeNode> generateTrees(int n) {
        return generateTrees(1, n);
    }
}
