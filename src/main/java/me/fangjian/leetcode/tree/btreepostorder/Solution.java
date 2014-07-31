package me.fangjian.leetcode.tree.btreepostorder;

import java.util.ArrayList;
import java.util.List;

/**
 * Created at 7/30/14
 *
 * https://oj.leetcode.com/problems/binary-tree-postorder-traversal/
 *
 * @author Jian Fang (jfang@rocketfuelinc.com)
 */
public class Solution {
    private void reverseList(TreeNode from, TreeNode to){
        if(from != null){
            TreeNode p1 = from, p2 = from.right, p3 = null;
            if(p2 != null) p3 = p2.right;
            while(p1 != to && p1 != null){
                if(p2 != null){
                    p2.right = p1;
                }
                p1 = p2;
                p2 = p3;
                if(p2 != null) p3 = p2.right;
            }
        }
    }

    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<Integer>();
        TreeNode dummyRoot = new TreeNode(0);
        dummyRoot.left = root;
        TreeNode p = null, current = dummyRoot;
        while(current != null){
            if(current.left == null){
                current = current.right;
            } else {
                p = current.left;
                while(p.right != null && p.right != current){
                    p = p.right;
                }
                if(p.right == null){
                    p.right = current;
                    current = current.left;
                } else {
                    reverseList(current.left, p);
                    TreeNode q = p;
                    while(true){
                        result.add(q.val);
                        if(q == current.left){
                            break;
                        }
                        q = q.right;
                    }
                    reverseList(p, current.left);
                    p.right = null;
                    current = current.right;
                }
            }
        }
        return result;
    }
}
