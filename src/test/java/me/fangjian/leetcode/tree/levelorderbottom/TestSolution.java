package me.fangjian.leetcode.tree.levelorderbottom;

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
    public void testSolution(){
        Solution solution = new Solution();
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        List<List<Integer>> result = solution.levelOrderBottom(root);
        assertEquals(result.size(), 2);
        assertEquals(result.get(0).size(), 1);
        assertEquals(result.get(0).get(0), new Integer(2));
        assertEquals(result.get(1).size(), 1);
        assertEquals(result.get(1).get(0), new Integer(1));
    }
}
