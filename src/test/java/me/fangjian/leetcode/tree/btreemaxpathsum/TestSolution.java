package me.fangjian.leetcode.tree.btreemaxpathsum;

import org.testng.annotations.Test;
import static org.testng.AssertJUnit.*;

/**
 * Created at 7/16/14
 *
 * @author Jian Fang (jfang@rocketfuelinc.com)
 */
public class TestSolution {
    @Test
    public void testEmpty(){
        assertEquals(new Solution().maxPathSum(null), 0);
    }

    @Test
    public void testSingleNode(){
        TreeNode root = new TreeNode(1);
        assertEquals(new Solution().maxPathSum(root), 1);
    }

    @Test
    public void testThreeNodes(){
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        assertEquals(new Solution().maxPathSum(root), 6);
    }

    @Test
    public void testMultipleNodes(){
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(20);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(30);
        root.left.right = new TreeNode(40);
        root.right.right = new TreeNode(5);
        assertEquals(new Solution().maxPathSum(root), 90);
    }

    @Test
    public void testSingleNegativeNodes(){
        TreeNode root = new TreeNode(-1);
        assertEquals(new Solution().maxPathSum(root), -1);
    }

    @Test
    public void testMultipleNegativeNodes(){
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(3);
        root.right = new TreeNode(-2);
        root.left.left = new TreeNode(4);
        root.right.left = new TreeNode(1);
        root.right.right = new TreeNode(1);
        assertEquals(new Solution().maxPathSum(root), 8);
    }
}
