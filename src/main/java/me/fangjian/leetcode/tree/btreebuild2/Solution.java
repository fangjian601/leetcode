package me.fangjian.leetcode.tree.btreebuild2;

/**
 * Created at 7/31/14
 *
 * https://oj.leetcode.com/problems/construct-binary-tree-from-preorder-and-inorder-traversal/
 *
 * @author Jian Fang (jfang@rocketfuelinc.com)
 */
public class Solution {
    private TreeNode buildTree(int[] preorder, int[] inorder,
                               int preStart, int preEnd,
                               int inStart, int inEnd){
        if(inEnd - inStart + 1 == 0) { return null; }
        TreeNode root = new TreeNode(preorder[preStart]);
        int mid = 0;
        for(int i = inStart; i <= inEnd; i++){
            if(inorder[i] == root.val){
                mid = i;
                break;
            }
        }
        int leftLen = mid - inStart;
        int rightLen = inEnd - mid;
        root.left = buildTree(preorder, inorder, preStart + 1, preStart + leftLen, inStart, mid - 1);
        root.right = buildTree(preorder, inorder, preEnd - rightLen + 1, preEnd, mid + 1, inEnd);
        return root;
    }

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        return buildTree(preorder, inorder, 0, preorder.length - 1, 0, inorder.length - 1);
    }
}
