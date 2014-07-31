package me.fangjian.leetcode.array.subsets;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * Created at 7/31/14
 *
 * https://oj.leetcode.com/problems/subsets/
 *
 * @author Jian Fang (jfang@rocketfuelinc.com)
 */
public class Solution {
    private void subsets(int[] S, int k, List<List<Integer>> result){
        if(k == 0){
            result.add(new ArrayList<Integer>());
        } else {
            LinkedList<Integer> subset = new LinkedList<Integer>();
            if(S.length > 0 ) { subset.add(0); }
            boolean back = false;
            while(!subset.isEmpty()){
                if(back){
                    int tail = subset.get(subset.size() - 1);
                    subset.remove(subset.size() - 1);
                    if(tail != S.length - 1){
                        subset.add(tail + 1);
                        back = false;
                    }
                } else {
                    if(subset.size() == k){
                        List<Integer> set = new ArrayList<Integer>(k);
                        for(Integer elemIndex : subset){
                            set.add(S[elemIndex]);
                        }
                        result.add(set);
                        back = true;
                    } else {
                        int tail = subset.get(subset.size() - 1);
                        if(tail != S.length - 1){
                            subset.add(tail + 1);
                        } else {
                            back = true;
                        }
                    }
                }
            }
        }
    }

    public List<List<Integer>> subsets(int[] S) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        Arrays.sort(S);
        for(int i = 0; i <= S.length; i++){
            subsets(S, i, result);
        }
        return result;
    }
}
