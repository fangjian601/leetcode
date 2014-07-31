package me.fangjian.leetcode.other.uniquepaths2;

/**
 * Created at 7/30/14
 *
 * https://oj.leetcode.com/problems/unique-paths-ii/
 *
 * @author Jian Fang (jfang@rocketfuelinc.com)
 */
public class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        if(obstacleGrid.length == 0){
            return 0;
        }
        int N = obstacleGrid.length;
        int M = obstacleGrid[0].length;
        int[][] pathCounts = new int[N][M];
        pathCounts[N - 1][M - 1] = 1 - obstacleGrid[N - 1][M - 1];
        for(int i = N - 1; i >= 0; i--){
            for(int j = M - 1; j >= 0; j--){
                if(i == N - 1 && j == M - 1){
                    continue;
                }
                if(obstacleGrid[i][j] == 1){
                    pathCounts[i][j] = 0;
                } else {
                    pathCounts[i][j] = 0;
                    if(i != N - 1){
                        pathCounts[i][j] += pathCounts[i + 1][j];
                    }
                    if(j != M - 1){
                        pathCounts[i][j] += pathCounts[i][j + 1];
                    }
                }
            }
        }
        return pathCounts[0][0];
    }
}
