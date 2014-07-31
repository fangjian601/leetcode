package me.fangjian.leetcode.tree.mindepth;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created at 7/30/14
 *
 * https://oj.leetcode.com/problems/minimum-depth-of-binary-tree/
 *
 * @author Jian Fang (jfang@rocketfuelinc.com)
 */
public class Solution {
    public int minDepth(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        int minDepth = 0;
        if(root != null){
            queue.add(root);
        }
        while(!queue.isEmpty()){
            minDepth++;
            int size = queue.size();
            while(size != 0){
                TreeNode node = queue.poll();
                if(node.left == null && node.right == null){
                    return minDepth;
                }
                if(node.left != null){
                    queue.add(node.left);
                }
                if(node.right != null){
                    queue.add(node.right);
                }
                size--;
            }
        }
        return minDepth;
    }
}
