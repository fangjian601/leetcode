package me.fangjian.leetcode.other.minpathsum;

/**
 * Created at 7/29/14
 *
 * https://oj.leetcode.com/problems/minimum-path-sum/
 *
 * @author Jian Fang (jfang@rocketfuelinc.com)
 */
public class Solution {
    public int minPathSum(int[][] grid) {
        if(grid.length == 0){
            return 0;
        }
        int m = grid.length;
        int n = grid[0].length;
        int[][] sums = new int[m][n];
        for(int i = m - 1; i >= 0; i--){
            for(int j = n - 1; j >= 0; j--){
                sums[i][j] = grid[i][j];
                if(i != m - 1 && j == n - 1){
                    sums[i][j] += sums[i + 1][j];
                } else if(i == m - 1 && j != n - 1){
                    sums[i][j] += sums[i][j + 1];
                } else if(i != m - 1 && j != n - 1){
                    sums[i][j] += Math.min(sums[i][j + 1], sums[i + 1][j]);
                }
            }
        }
        return sums[0][0];
    }
}
