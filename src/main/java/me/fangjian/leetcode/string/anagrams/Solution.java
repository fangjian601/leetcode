package me.fangjian.leetcode.string.anagrams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created at 7/28/14
 *
 * https://oj.leetcode.com/problems/anagrams/
 *
 * @author Jian Fang (jfang@rocketfuelinc.com)
 */
public class Solution {

    private class Pair implements Comparable<Pair> {
        String str;
        int index;
        public Pair(String x, int y) {str = x; index = y;}
        @Override
        public int compareTo(Pair o) {
            return str.compareTo(o.str);
        }
    }

    public List<String> anagrams(String[] strs) {
        Pair[] sorted = new Pair[strs.length];
        int index = 0;
        for(String str : strs){
            char[] chs = str.toCharArray();
            Arrays.sort(chs);
            sorted[index] = new Pair(String.valueOf(chs), index);
            index++;
        }
        Arrays.sort(sorted);
        List<String> results = new ArrayList<String>();
        int i = 0, j = 1;
        while(i < strs.length - 1 && j < strs.length){
            if(sorted[i].str.equals(sorted[j].str)){
                if(i + 1 == j){
                    results.add(strs[sorted[i].index]);
                }
                results.add(strs[sorted[j].index]);
            } else {
                i = j;
            }
            j++;
        }
        return results;
    }
}
