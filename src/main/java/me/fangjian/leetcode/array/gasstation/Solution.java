package me.fangjian.leetcode.array.gasstation;

/**
 * Created at 8/1/14
 *
 * https://oj.leetcode.com/problems/gas-station/
 *
 * @author Jian Fang (jfang@rocketfuelinc.com)
 */
public class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int gasLeft = 0, gasNeeded = 0, start = 0;
        for(int i = 0; i < gas.length; i++){
            gasLeft += (gas[i] - cost[i]);
            if(gasLeft < 0){
                gasNeeded -= gasLeft;
                start = i + 1;
                gasLeft = 0;
            }
        }
        if(gasNeeded <= gasLeft){
            return start;
        } else {
            return -1;
        }
    }
}
