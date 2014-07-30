package me.fangjian.leetcode.tree.symtree;

import org.testng.annotations.Test;
import static org.testng.AssertJUnit.*;

/**
 * Created at 7/29/14
 *
 * @author Jian Fang (jfang@rocketfuelinc.com)
 */
public class TestSolution {
    @Test
    public void testSolution(){
        Solution solution = new Solution();
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(2);
        root.left.right = new TreeNode(4);
        root.right.right = new TreeNode(4);
        assertEquals(solution.isSymmetric(root), false);
        root.right.left = new TreeNode(4);
        root.right.right = null;
        assertEquals(solution.isSymmetric(root), true);
    }
}
