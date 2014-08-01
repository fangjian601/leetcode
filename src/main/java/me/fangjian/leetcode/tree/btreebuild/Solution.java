package me.fangjian.leetcode.tree.btreebuild;

/**
 * Created at 7/31/14
 *
 * https://oj.leetcode.com/problems/construct-binary-tree-from-inorder-and-postorder-traversal/
 *
 * @author Jian Fang (jfang@rocketfuelinc.com)
 */
public class Solution {
    private TreeNode buildTree(int[] inorder, int[] postorder,
                               int inStart, int inEnd, int postStart, int postEnd){
        if(inEnd - inStart + 1 == 0) { return null; }
        TreeNode root = new TreeNode(postorder[postEnd]);
        int mid = 0;
        for(int i = inStart; i <= inEnd; i++){
            if(inorder[i] == root.val){
                mid = i;
                break;
            }
        }

        int leftLen = mid - inStart;
        int rightLen = inEnd - mid;
        root.left = buildTree(inorder, postorder, inStart, mid - 1, postStart, postStart + leftLen - 1);
        root.right = buildTree(inorder, postorder, mid + 1, inEnd, postEnd - rightLen, postEnd - 1);
        return root;
    }

    public TreeNode buildTree(int[] inorder, int[] postorder) {
        return buildTree(inorder, postorder, 0, inorder.length - 1, 0, postorder.length - 1);
    }
}
