package me.fangjian.leetcode.tree.flatten;

import org.testng.annotations.Test;
import static org.testng.AssertJUnit.*;

/**
 * Created at 7/30/14
 *
 * @author Jian Fang (jfang@rocketfuelinc.com)
 */
public class TestSolution {
    @Test
    public void testSolution(){
        Solution solution = new Solution();
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        solution.flatten(root);
        assertEquals(root.val, 1);
        assertEquals(root.left, null);
        assertEquals(root.right.val, 2);
        assertEquals(root.right.left, null);
        assertEquals(root.right.right.val, 3);
        assertEquals(root.right.right.left, null);
    }
}
