package me.fangjian.leetcode.other.uniquepaths;

/**
 * Created at 7/29/14
 *
 * https://oj.leetcode.com/problems/unique-paths/
 *
 * @author Jian Fang (jfang@rocketfuelinc.com)
 */
public class Solution {
    public int uniquePaths(int m, int n) {
        if(m < 2 || n < 2){
            return 1;
        } else {
            int[][] paths = new int[m + 1][n + 1];
            paths[0][0] = 1;
            for(int i = 0; i <= m; i++){
                paths[i][1] = 1;
            }
            for(int i = 0; i <= n; i++){
                paths[1][i] = 1;
            }
            for(int i = 2; i <= m; i++){
                for(int j = 2; j <= n; j++){
                    paths[i][j] = paths[i - 1][j] + paths[i][j - 1];
                }
            }
            return paths[m][n];
        }
    }
}
