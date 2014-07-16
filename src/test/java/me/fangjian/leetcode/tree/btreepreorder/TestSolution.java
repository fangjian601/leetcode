package me.fangjian.leetcode.tree.btreepreorder;

import org.testng.annotations.Test;
import static org.testng.AssertJUnit.*;

import java.util.Arrays;

/**
 * Created at 7/15/14
 *
 * @author Jian Fang (jfang@rocketfuelinc.com)
 */
public class TestSolution {
    @Test
    public void testNullInput(){
        assertEquals(new Solution().preorderTraversal(null).isEmpty(), true);
    }

    @Test
    public void testSingleNode(){
        TreeNode root = new TreeNode(1);
        assertEquals(new Solution().preorderTraversal(root), Arrays.asList(1));
    }

    @Test
    public void testThreeNode(){
        Solution solution = new Solution();
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        assertEquals(solution.preorderTraversal(root), Arrays.asList(1,2,3));
    }

    @Test
    public void testMultipleNodes(){
        Solution solution = new Solution();
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.left.left = new TreeNode(5);
        root.left.left.right = new TreeNode(6);
        root.right.right = new TreeNode(7);
        assertEquals(solution.preorderTraversal(root), Arrays.asList(1,2,4,5,6,3,7));
    }
}
