package me.fangjian.leetcode.tree.btreepreorder;

import java.util.ArrayList;
import java.util.List;

/**
 * Created at 7/15/14
 *
 * https://oj.leetcode.com/problems/binary-tree-preorder-traversal/
 *
 * @author Jian Fang (jfang@rocketfuelinc.com)
 */
public class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<Integer>();
        TreeNode pre, current = root;
        while(current != null){
            if(current.left == null){
                result.add(current.val);
                current = current.right;
            } else {
                pre = current.left;
                while(pre.right != null && pre.right != current){
                    pre = pre.right;
                }
                if(pre.right == null){
                    result.add(current.val);
                    pre.right = current;
                    current = current.left;
                } else {
                    pre.right = null;
                    current = current.right;
                }
            }
        }
        return result;
    }
}
