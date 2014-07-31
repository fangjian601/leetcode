package me.fangjian.leetcode.tree.btreeinorder;

import java.util.ArrayList;
import java.util.List;

/**
 * Created at 7/30/14
 *
 * https://oj.leetcode.com/problems/binary-tree-inorder-traversal/
 *
 * @author Jian Fang (jfang@rocketfuelinc.com)
 */
public class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<Integer>();
        TreeNode current = root;
        while(current != null){
            if(current.left == null){
                result.add(current.val);
                current = current.right;
            } else {
                TreeNode p = current.left;
                while(p.right != null && p.right != current){
                    p = p.right;
                }
                if(p.right == null){
                    p.right = current;
                    current = current.left;
                } else {
                    result.add(current.val);
                    p.right = null;
                    current = current.right;
                }
            }
        }
        return result;
    }
}
