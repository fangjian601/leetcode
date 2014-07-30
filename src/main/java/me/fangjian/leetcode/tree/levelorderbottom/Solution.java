package me.fangjian.leetcode.tree.levelorderbottom;

import java.util.*;

/**
 * Created at 7/30/14
 *
 * https://oj.leetcode.com/problems/binary-tree-level-order-traversal-ii/
 *
 * @author Jian Fang (jfang@rocketfuelinc.com)
 */
public class Solution {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> result = new LinkedList<List<Integer>>();
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        if(root != null){
            queue.add(root);
        }
        while(!queue.isEmpty()){
            int i = queue.size();
            List<Integer> values = new ArrayList<Integer>(i);
            while(i != 0){
                TreeNode node = queue.poll();
                values.add(node.val);
                if(node.left != null) queue.add(node.left);
                if(node.right != null) queue.add(node.right);
                i--;
            }
            result.add(0, values);
        }
        return result;
    }
}
