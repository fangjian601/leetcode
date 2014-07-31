package me.fangjian.leetcode.array.longestconsecutive;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * Created at 7/30/14
 *
 * https://oj.leetcode.com/problems/longest-consecutive-sequence/
 *
 * @author Jian Fang (jfang@rocketfuelinc.com)
 */
public class Solution {
    private class Interval{
        int start;
        int end;
        public Interval(int x, int y){
            start = x;
            end = y;
        }
    }

    public int longestConsecutive(int[] num) {
        Set<Integer> duplicate = new HashSet<Integer>();
        Map<Integer, Interval> startIndex = new HashMap<Integer, Interval>();
        Map<Integer, Interval> endIndex = new HashMap<Integer, Interval>();
        int max = 0;
        for(int i = 0; i < num.length; i++){
            if(!duplicate.contains(num[i])){
                duplicate.add(num[i]);
                Interval rightInterval = startIndex.get(num[i] + 1);
                Interval leftInterval = endIndex.get(num[i] - 1);
                Interval interval = null;
                if(leftInterval == null && rightInterval == null){
                    interval = new Interval(num[i], num[i]);
                    startIndex.put(num[i], interval);
                    endIndex.put(num[i], interval);
                } else if(leftInterval == null && rightInterval != null){
                    interval = new Interval(num[i], rightInterval.end);
                    startIndex.put(num[i], interval);
                    endIndex.put(rightInterval.end, interval);
                } else if(leftInterval != null && rightInterval == null){
                    interval = new Interval(leftInterval.start, num[i]);
                    endIndex.put(num[i], interval);
                    startIndex.put(leftInterval.start, interval);
                } else {
                    interval = new Interval(leftInterval.start, rightInterval.end);
                    endIndex.put(rightInterval.end, interval);
                    startIndex.put(leftInterval.start, interval);
                }
                max = Math.max(max, interval.end - interval.start + 1);
            }
        }
        return max;
    }
}
