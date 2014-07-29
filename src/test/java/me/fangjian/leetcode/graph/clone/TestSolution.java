package me.fangjian.leetcode.graph.clone;

import org.testng.annotations.Test;
import static org.testng.AssertJUnit.*;

/**
 * Created at 7/28/14
 *
 * @author Jian Fang (jfang@rocketfuelinc.com)
 */
public class TestSolution{
    @Test
    public void testGraph(){
        UndirectedGraphNode node = new UndirectedGraphNode(0);
        UndirectedGraphNode node1 = new UndirectedGraphNode(1);
        UndirectedGraphNode node2 = new UndirectedGraphNode(2);
        node.neighbors.add(node1);
        node.neighbors.add(node2);
        node1.neighbors.add(node2);
        node2.neighbors.add(node2);

        UndirectedGraphNode newNode = new Solution().cloneGraph(node);
        assertEquals(newNode.label, node.label);
        assertEquals(newNode.neighbors.size(), 2);
        assertEquals(newNode.neighbors.get(0).label, node1.label);
        assertEquals(newNode.neighbors.get(1).label, node2.label);
        assertEquals(newNode.neighbors.get(0).neighbors.size(), 1);
        assertEquals(newNode.neighbors.get(0).neighbors.get(0).label, node2.label);
        assertEquals(newNode.neighbors.get(1).neighbors.size(), 1);
        assertEquals(newNode.neighbors.get(1).neighbors.get(0).label, node2.label);
    }
}
