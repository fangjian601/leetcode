package me.fangjian.leetcode.tree.recoverbst;

import org.testng.annotations.Test;
import static org.testng.AssertJUnit.*;

/**
 * Created at 8/1/14
 *
 * @author Jian Fang (jfang@rocketfuelinc.com)
 */
public class TestSolution {
    @Test
    public void testSolution() {
        Solution solution = new Solution();
        TreeNode root = new TreeNode(3);
        root.right = new TreeNode(1);
        root.right.left = new TreeNode(2);
        solution.recoverTree(root);
        assertEquals(root.val, 1);
        assertEquals(root.right.val, 3);
        assertEquals(root.right.left.val, 2);
    }
}

