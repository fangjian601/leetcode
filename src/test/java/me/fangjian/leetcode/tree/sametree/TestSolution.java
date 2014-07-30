package me.fangjian.leetcode.tree.sametree;

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
        TreeNode node1 = new TreeNode(1);
        node1.left = new TreeNode(2);

        TreeNode node2 = new TreeNode(1);
        node2.left = new TreeNode(2);

        TreeNode node3 = new TreeNode(1);
        node3.right = new TreeNode(2);

        assertEquals(solution.isSameTree(node1, node2), true);
        assertEquals(solution.isSameTree(node1, node3), false);
    }
}
