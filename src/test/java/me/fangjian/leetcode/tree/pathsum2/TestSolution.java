package me.fangjian.leetcode.tree.pathsum2;

import org.testng.annotations.Test;

import java.util.List;

import static org.testng.AssertJUnit.*;

/**
 * Created at 7/31/14
 *
 * @author Jian Fang (jfang@rocketfuelinc.com)
 */
public class TestSolution {
    @Test
    public void testSolution() {
        Solution solution = new Solution();
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        List<List<Integer>> result = solution.pathSum(root, 3);
        assertEquals(result.size(), 1);
        assertEquals(result.get(0).get(0), new Integer(1));
        assertEquals(result.get(0).get(1), new Integer(2));
    }
}
