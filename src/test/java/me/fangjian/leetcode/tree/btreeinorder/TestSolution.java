package me.fangjian.leetcode.tree.btreeinorder;

import org.testng.annotations.Test;

import java.util.List;

import static org.testng.AssertJUnit.*;

/**
 * Created at 7/30/14
 *
 * @author Jian Fang (jfang@rocketfuelinc.com)
 */
public class TestSolution {
    @Test
    public void testSolution() {
        Solution solution = new Solution();
        TreeNode root = new TreeNode(2);
        root.left = new TreeNode(1);
        root.right = new TreeNode(3);
        List<Integer> result = solution.inorderTraversal(root);
        assertEquals(result.size(), 3);
        assertEquals(result.get(0), new Integer(1));
        assertEquals(result.get(1), new Integer(2));
        assertEquals(result.get(2), new Integer(3));
    }
}
