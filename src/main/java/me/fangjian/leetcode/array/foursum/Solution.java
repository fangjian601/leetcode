package me.fangjian.leetcode.array.foursum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created at 8/3/14
 *
 * https://oj.leetcode.com/problems/4sum/
 *
 * @author Jian Fang (jfang@rocketfuelinc.com)
 */
public class Solution {
    public List<List<Integer>> fourSum(int[] num, int target) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        int i = 0;
        Arrays.sort(num);
        while(i < num.length - 3){
            int j = i + 1;
            while(j < num.length - 2){
                int m = j + 1, n = num.length - 1;
                while(m < n){
                    if(num[i] + num[j] + num[m] + num[n] == target){
                        result.add(Arrays.asList(num[i], num[j], num[m], num[n]));
                        do{m++;}while(m < n && num[m - 1] == num[m]);
                        do{n--;}while(m < n && num[n + 1] == num[n]);
                    } else if(num[i] + num[j] + num[m] + num[n] > target){
                        do{n--;}while(m < n && num[n + 1] == num[n]);
                    } else {
                        do{m++;}while(m < n && num[m - 1] == num[m]);
                    }
                }
                do{j++;}while(j < num.length - 2 && num[j - 1] == num[j]);
            }
            do{i++;}while((i < num.length - 3 && num[i - 1] == num[i]));
        }
        return result;
    }
}
