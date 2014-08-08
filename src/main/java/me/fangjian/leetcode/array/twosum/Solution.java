package me.fangjian.leetcode.array.twosum;

import java.util.Arrays;

/**
 * Created at 8/3/14
 *
 * https://oj.leetcode.com/problems/two-sum/
 *
 * @author Jian Fang (jfang@rocketfuelinc.com)
 */
public class Solution {
    private class NumberIndex implements Comparable<NumberIndex>{
        int number;
        int index;
        public NumberIndex(int n, int i){
            number = n;
            index = i;
        }

        @Override
        public int compareTo(NumberIndex o) {
            return number - o.number;
        }
    }

    public int[] twoSum(int[] numbers, int target) {
        NumberIndex[] indexes = new NumberIndex[numbers.length];
        for(int i = 0; i < numbers.length; i++){
            indexes[i] = new NumberIndex(numbers[i], i + 1);
        }
        Arrays.sort(indexes);
        int i = 0, j = indexes.length - 1;
        while(i < j){
            if(indexes[i].number + indexes[j].number == target){
                return new int[]{Math.min(indexes[i].index, indexes[j].index),
                        Math.max(indexes[i].index, indexes[j].index)};
            } else if(indexes[i].number + indexes[j].number > target){
                j--;
            } else {
                i++;
            }
        }
        return new int[]{0, 0};
    }
}
