package me.fangjian.leetcode.tree.btreebuild;

import org.testng.annotations.Test;
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
        TreeNode root = solution.buildTree(new int[]{1, 2}, new int[]{2, 1});
        assertEquals(root.val, 1);
        assertEquals(root.right.val, 2);
    }
}
