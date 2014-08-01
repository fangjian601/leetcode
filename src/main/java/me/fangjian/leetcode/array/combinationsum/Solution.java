package me.fangjian.leetcode.array.combinationsum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * Created at 7/31/14
 *
 * https://oj.leetcode.com/problems/combination-sum/
 *
 * @author Jian Fang (jfang@rocketfuelinc.com)
 */
public class Solution {
    private void combinationSum(int[] candidates, int target, int startIndex, List<List<Integer>> result, List<Integer> set){
        for(int i = startIndex; i < candidates.length; i++){
            if(candidates[i] == target){
                set.add(candidates[i]);
                result.add(new ArrayList<Integer>(set));
                set.remove(set.size() - 1);
                break;
            } else if(candidates[i] < target){
                set.add(candidates[i]);
                combinationSum(candidates, target - candidates[i], i, result, set);
                set.remove(set.size() - 1);
            } else {
                break;
            }
        }
    }

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        Arrays.sort(candidates);
        combinationSum(candidates, target, 0, result, new LinkedList<Integer>());
        return result;
    }
}
