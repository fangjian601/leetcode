package me.fangjian.leetcode.tree.maxdepth;

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
        TreeNode[] nodes = new TreeNode[]{
                new TreeNode(1),
                new TreeNode(2),
                new TreeNode(3),
                new TreeNode(4)
        };
        nodes[0].left = nodes[1];
        nodes[0].right = nodes[3];
        nodes[1].left = nodes[2];
        assertEquals(solution.maxDepth(nodes[0]), 3);
    }
}
