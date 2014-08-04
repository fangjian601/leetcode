package me.fangjian.leetcode.array.mergeintervals;

import java.util.*;

/**
 * Created at 8/3/14
 *
 * https://oj.leetcode.com/problems/merge-intervals/
 *
 * @author Jian Fang (jfang@rocketfuelinc.com)
 */
public class Solution {
    public List<Interval> merge(List<Interval> intervals) {
        List<Interval> result = new ArrayList<Interval>();
        Collections.sort(intervals, new Comparator<Interval>() {
            @Override
            public int compare(Interval o1, Interval o2) {
                return o1.start - o2.start;
            }
        });
        Interval lastInterval = null;
        for(Interval interval : intervals){
            if(lastInterval == null){
                lastInterval = new Interval(interval.start, interval.end);
            } else if(lastInterval.start <= interval.start && lastInterval.end >= interval.start){
                lastInterval.end = Math.max(lastInterval.end, interval.end);
            } else{
                result.add(lastInterval);
                lastInterval = new Interval(interval.start, interval.end);
            }
        }
        if(lastInterval != null){
            result.add(lastInterval);
        }
        return result;
    }
}
