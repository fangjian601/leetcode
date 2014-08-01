package me.fangjian.leetcode.tree.recoverbst;

/**
 * Created at 8/1/14
 *
 * https://oj.leetcode.com/problems/recover-binary-search-tree/
 *
 * @author Jian Fang (jfang@rocketfuelinc.com)
 */
public class Solution {
    private class Pair{
        TreeNode first;
        TreeNode second;
        public Pair(TreeNode x, TreeNode y){
            first = x;
            second = y;
        }
    }
    public void recoverTree(TreeNode root) {
        Pair p1 = null, p2 = null;
        TreeNode previous = null, current = root;
        while(current != null){
            if(current.left == null){
                previous = current;
                current = current.right;
            } else {
                TreeNode tmp = current.left;
                while(tmp.right != null && tmp.right != current) { tmp = tmp.right; }
                if(tmp.right == null){
                    tmp.right = current;
                    current = current.left;
                } else {
                    tmp.right = null;
                    previous = current;
                    current = current.right;
                }
            }
            if(previous != null && current != null && previous.val > current.val){
                if(p1 == null){
                    p1 = new Pair(previous, current);
                } else{
                    p2 = new Pair(previous, current);
                }
            }
        }
        if(p1 != null && p2 == null){
            int tmp = p1.first.val;
            p1.first.val = p1.second.val;
            p1.second.val = tmp;
        } else if(p2 != null){
            int tmp = p1.first.val;
            p1.first.val = p2.second.val;
            p2.second.val = tmp;
        }
    }
}
