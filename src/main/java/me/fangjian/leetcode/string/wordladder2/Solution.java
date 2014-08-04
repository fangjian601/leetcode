package me.fangjian.leetcode.string.wordladder2;

import java.util.*;

/**
 * Created at 8/3/14
 *
 * https://oj.leetcode.com/problems/word-ladder-ii/
 *
 * @author Jian Fang (jfang@rocketfuelinc.com)
 */
public class Solution {
    private class GraphNode{
        String word;
        List<GraphNode> parents;
        int level;
        public GraphNode(String w){
            word = w;
            parents = new LinkedList<GraphNode>();
        }
        public GraphNode(String w, int l, GraphNode p){
            word = w;
            level = l;
            parents = new LinkedList<GraphNode>();
            parents.add(p);
        }
    }

    private void traversalGraph(GraphNode node, List<String> current, List<List<String>> result){
        current.add(0, node.word);
        if(node.parents.size() == 0){
            result.add(new ArrayList<String>(current));
        } else {
            for(GraphNode parentNode : node.parents){
                traversalGraph(parentNode, current, result);
            }
        }
        current.remove(0);
    }

    public List<List<String>> findLadders(String start, String end, Set<String> dict) {
        List<List<String>> result = new LinkedList<List<String>>();
        Queue<GraphNode> nodes = new LinkedList<GraphNode>();
        Map<String, GraphNode> visitedNode = new HashMap<String, GraphNode>();
        int level = 0;
        nodes.add(new GraphNode(start));
        visitedNode.put(start, nodes.peek());
        while(!nodes.isEmpty()){
            int size = nodes.size();
            while(size > 0){
                GraphNode node = nodes.poll();
                if(node.word.equals(end)){
                    traversalGraph(node, new LinkedList<String>(), result);
                    return result;
                }
                char[] chars = node.word.toCharArray();
                for(int i = 0; i < chars.length; i++){
                    for(char ch = 'a'; ch <= 'z'; ch++){
                        if(ch != node.word.charAt(i)){
                            chars[i] = ch;
                            String newWord = new String(chars);
                            GraphNode newNode = visitedNode.get(newWord);
                            if(newWord.equals(end) || dict.contains(newWord)){
                                if(newNode == null){
                                    newNode = new GraphNode(newWord, level, node);
                                    visitedNode.put(newWord, newNode);
                                    nodes.add(newNode);
                                } else {
                                    if(newNode.level == level){
                                        newNode.parents.add(node);
                                    }
                                }
                            }
                        }
                    }
                    chars[i] = node.word.charAt(i);
                }
                size--;
            }
            level++;
        }
        return result;
    }
}
