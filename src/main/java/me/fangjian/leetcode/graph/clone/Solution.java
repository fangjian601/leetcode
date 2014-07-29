package me.fangjian.leetcode.graph.clone;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * Created at 7/28/14
 *
 * https://oj.leetcode.com/problems/clone-graph/
 *
 * @author Jian Fang (jfang@rocketfuelinc.com)
 */
public class Solution {
    public UndirectedGraphNode cloneGraph(UndirectedGraphNode node) {
        if(node == null) return null;
        Map<UndirectedGraphNode, UndirectedGraphNode> nodeMap = new HashMap<UndirectedGraphNode, UndirectedGraphNode>();
        Stack<UndirectedGraphNode> stack = new Stack<UndirectedGraphNode>();
        UndirectedGraphNode newRoot = new UndirectedGraphNode(node.label);
        nodeMap.put(node, newRoot);
        stack.push(node);
        while(!stack.empty()){
            UndirectedGraphNode old = stack.pop();
            UndirectedGraphNode current = nodeMap.get(old);
            for(UndirectedGraphNode oldChild : old.neighbors){
                UndirectedGraphNode currentChild = nodeMap.get(oldChild);
                if(currentChild == null){
                    currentChild = new UndirectedGraphNode(oldChild.label);
                    nodeMap.put(oldChild, currentChild);
                    stack.push(oldChild);
                }
                current.neighbors.add(currentChild);
            }
        }
        return newRoot;
    }
}
