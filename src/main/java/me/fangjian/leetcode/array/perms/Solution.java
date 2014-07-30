package me.fangjian.leetcode.array.perms;

import java.util.*;

/**
 * Created at 7/29/14
 *
 * https://oj.leetcode.com/problems/permutations-ii/
 *
 * @author Jian Fang (jfang@rocketfuelinc.com)
 */
public class Solution {

    private Map<Integer, Integer> candidates(int[] num){
        Map<Integer, Integer> map = new TreeMap<Integer, Integer>();
        for(int item : num){
            addCandidate(map, item);
        }
        return map;
    }

    private void addCandidate(Map<Integer, Integer> candidates, int item){
        Integer count = candidates.get(item);
        if(count == null){
            count = 1;
        } else {
            count++;
        }
        candidates.put(item, count);
    }

    private void removeCandidate(Map<Integer, Integer> candidates, int item){
        Integer value = candidates.get(item);
        if(value == 1){
            candidates.remove(item);
        } else if(value != null){
            candidates.put(item, value - 1);
        }
    }

    private void permute(Map<Integer, Integer> candidates, List<Integer> current, List<List<Integer>> results){
        if(candidates.size() == 0){
            results.add(new ArrayList<Integer>(current));
        } else {
            Integer[] keys = new Integer[candidates.size()];
            candidates.keySet().toArray(keys);
            for(Integer key : keys){
                current.add(key);
                removeCandidate(candidates, key);

                permute(candidates, current, results);

                current.remove(current.size() - 1);
                addCandidate(candidates, key);
            }
        }
    }

    public List<List<Integer>> permute(int[] num) {
        List<List<Integer>> results = new ArrayList<List<Integer>>();
        Map<Integer, Integer> candidates = candidates(num);
        permute(candidates, new ArrayList<Integer>(), results);
        return results;
    }
}
