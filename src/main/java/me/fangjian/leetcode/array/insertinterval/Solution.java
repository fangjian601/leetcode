package me.fangjian.leetcode.array.insertinterval;

import java.util.List;

/**
 * Created at 7/27/14
 *
 * https://oj.leetcode.com/problems/insert-interval/
 *
 * @author Jian Fang (jfang@rocketfuelinc.com)
 */
public class Solution {
    private boolean inInterval(Interval interval, int value){
        return value >= interval.start && value <= interval.end;
    }

    public List<Interval> insert(List<Interval> intervals, Interval newInterval) {
        int insertIndex = -1;
        for(int i = 0; i < intervals.size(); i++){
            Interval interval = intervals.get(i);
            if(inInterval(interval, newInterval.start) && inInterval(interval, newInterval.end)){
                return intervals;
            }
            if(newInterval.start > interval.end &&
               (i == intervals.size() - 1 || newInterval.end < intervals.get(i + 1).start)){
                insertIndex = i + 1;
                break;
            }
            if(inInterval(interval, newInterval.start)){
                newInterval.start = interval.start;
                insertIndex = i;
                intervals.remove(i);
                i--;
                continue;
            }
            if(inInterval(newInterval, interval.start) && inInterval(newInterval, interval.end)){
                if(insertIndex == -1)insertIndex = i;
                intervals.remove(i);
                i--;
                continue;
            }
            if(inInterval(interval, newInterval.end)){
                if(insertIndex == -1)insertIndex = i;
                newInterval.end = interval.end;
                intervals.remove(i);
                break;
            }
            if(interval.start > newInterval.end){
                break;
            }
        }
        if(insertIndex != -1){
            intervals.add(insertIndex, newInterval);
        } else {
            intervals.add(0, newInterval);
        }
        return intervals;
    }
}
