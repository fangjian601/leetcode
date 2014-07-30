package me.fangjian.leetcode.array.triangle;

import java.util.List;

/**
 * Created at 7/28/14
 *
 * https://oj.leetcode.com/problems/triangle/
 *
 * @author Jian Fang (jfang@rocketfuelinc.com)
 */
public class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        if(triangle.size() == 0){
            return 0;
        }
        int[] minPath = new int[triangle.size()];
        for(int i = 0; i < minPath.length; i++){
            minPath[i] = triangle.get(minPath.length - 1).get(i);
        }
        for(int i = triangle.size() - 2; i >= 0; i--){
            for(int j = 0; j < triangle.get(i).size(); j++){
                minPath[j] = triangle.get(i).get(j) + Math.min(minPath[j], minPath[j + 1]);
            }
        }
        return minPath[0];
    }
}
