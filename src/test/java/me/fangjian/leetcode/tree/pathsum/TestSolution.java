package me.fangjian.leetcode.tree.pathsum;

import org.testng.annotations.Test;
import static org.testng.AssertJUnit.*;

/**
 * Created at 7/28/14
 *
 * @author Jian Fang (jfang@rocketfuelinc.com)
 */
public class TestSolution {
    @Test
    public void testMultipleNodes(){
        TreeNode[] nodes = new TreeNode[]{
            new TreeNode(5),
            new TreeNode(4),
            new TreeNode(8),
            new TreeNode(11),
            new TreeNode(13),
            new TreeNode(4),
            new TreeNode(7),
            new TreeNode(2),
            new TreeNode(1)
        };
        nodes[0].left = nodes[1];
        nodes[0].right = nodes[2];
        nodes[1].left = nodes[3];
        nodes[2].left = nodes[4];
        nodes[2].right = nodes[5];
        nodes[3].left = nodes[6];
        nodes[3].right = nodes[7];
        nodes[5].right = nodes[8];
        assertEquals(new Solution().hasPathSum(nodes[0], 22), true);
    }
}
