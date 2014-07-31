package me.fangjian.leetcode.tree.sumnumbers;

import java.util.*;

/**
 * Created at 7/30/14
 *
 * https://oj.leetcode.com/problems/sum-root-to-leaf-numbers/
 *
 * @author Jian Fang (jfang@rocketfuelinc.com)
 */
public class Solution {

    private void sumNumbers(TreeNode node, List<List<TreeNode>> paths, List<TreeNode> path){
        if(node == null){
            return;
        }
        path.add(node);
        if(node.left == null && node.right == null){
            paths.add(new ArrayList<TreeNode>(path));
        }
        if(node.left != null) {
            sumNumbers(node.left, paths, path);
        }
        if(node.right != null){
            sumNumbers(node.right, paths, path);
        }
        path.remove(path.size() - 1);
    }

    public int sumNumbers(TreeNode root) {
        List<List<TreeNode>> paths = new ArrayList<List<TreeNode>>();
        sumNumbers(root, paths, new LinkedList<TreeNode>());
        int sum = 0;
        for(List<TreeNode> path : paths){
            int mul = 1;
            for(int i = path.size() - 1; i >= 0; i--){
                sum += (mul * path.get(i).val);
                mul *= 10;
            }
        }
        return sum;
    }
}
