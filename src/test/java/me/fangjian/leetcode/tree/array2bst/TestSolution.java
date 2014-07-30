package me.fangjian.leetcode.tree.array2bst;

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
        TreeNode root = solution.sortedArrayToBST(new int[]{1,2,3});
        assertEquals(root.val, 2);
        assertEquals(root.left.val, 1);
        assertEquals(root.right.val, 3);
    }
}
