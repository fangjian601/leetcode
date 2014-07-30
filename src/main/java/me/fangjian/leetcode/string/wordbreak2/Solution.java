package me.fangjian.leetcode.string.wordbreak2;

import java.util.*;

/**
 * Created at 7/25/14
 *
 * https://oj.leetcode.com/problems/word-break-ii/
 *
 * @author Jian Fang (jfang@rocketfuelinc.com)
 */
public class Solution {

    private String join(List<String> words){
        StringBuilder sb = new StringBuilder();
        boolean first = true;
        for(String item : words){
            if(first){
                sb.append(item);
                first = false;
            } else{
                sb.append(" ");
                sb.append(item);
            }
        }
        return sb.toString();
    }

    private void recursive(String s, Set<String> dict,
                           List<List<Integer>> marks, int index,
                           List<String> words, List<String> result){
        for(Integer point : marks.get(index)){
            String word = s.substring(index, point);
            if(dict.contains(word)){
                words.add(word);
                if(point == s.length()){
                    result.add(join(words));
                } else {
                    recursive(s, dict, marks, point, words, result);
                }
                words.remove(words.size() - 1);
            }
        }
    }

    private List<List<Integer>> buildMarks(String s, Set<String> dict){
        List<List<Integer>> marks = new ArrayList<List<Integer>>();
        for(int i = 0; i < s.length(); i++){
            marks.add(new ArrayList<Integer>());
        }
        for(int i = s.length(); i >= 0; i--){
            if(i < s.length() && marks.get(i).isEmpty()) continue;
            for(int j = i - 1; j >= 0; j--){
                String word = s.substring(j, i);
                if(dict.contains(word)){
                    marks.get(j).add(i);
                }
            }
        }
        return marks;
    }

    public List<String> wordBreak(String s, Set<String> dict) {
        List<String> result = new ArrayList<String>();
        List<List<Integer>> marks = buildMarks(s, dict);
        recursive(s, dict, marks, 0, new LinkedList<String>(), result);
        return result;
    }
}
