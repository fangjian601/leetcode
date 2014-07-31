package me.fangjian.leetcode.tree.levelorderzigzag;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Created at 7/31/14
 *
 * https://oj.leetcode.com/problems/binary-tree-zigzag-level-order-traversal/
 *
 * @author Jian Fang (jfang@rocketfuelinc.com)
 */
public class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        LinkedList<TreeNode> queue = new LinkedList<TreeNode>();
        int level = 0;
        if(root != null){ queue.add(root); }
        while(!queue.isEmpty()){
            int size = queue.size();
            List<Integer> nodes = new ArrayList<Integer>();
            while(size != 0){
                TreeNode node = queue.get(size - 1);
                queue.remove(size - 1);
                nodes.add(node.val);
                if(level % 2 == 0){
                    if(node.left != null) { queue.add(node.left); }
                    if(node.right != null) { queue.add(node.right); }
                } else {
                    if(node.right != null) { queue.add(node.right); }
                    if(node.left != null) { queue.add(node.left); }
                }
                size--;
            }
            result.add(nodes);
            level++;
        }
        return result;
    }
}
