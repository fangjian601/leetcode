package me.fangjian.leetcode.tree.array2bst;

/**
 * Created at 7/29/14
 *
 * https://oj.leetcode.com/problems/convert-sorted-array-to-binary-search-tree/
 *
 * @author Jian Fang (jfang@rocketfuelinc.com)
 */
public class Solution {
    private TreeNode sortedArrayToBST(int[] num, int start, int end){
        int len = (end - start) + 1;
        if(len == 0){
            return null;
        } else {
            TreeNode root = new TreeNode(num[start + len / 2]);
            root.left = sortedArrayToBST(num, start, start + len / 2 - 1);
            root.right = sortedArrayToBST(num, start + len / 2 + 1, end);
            return root;
        }
    }

    public TreeNode sortedArrayToBST(int[] num) {
        return sortedArrayToBST(num, 0, num.length - 1);
    }
}
