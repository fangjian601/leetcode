package me.fangjian.leetcode.string.editdist;

/**
 * Created at 7/31/14
 *
 * https://oj.leetcode.com/problems/edit-distance/
 *
 * @author Jian Fang (jfang@rocketfuelinc.com)
 */
public class Solution {
    public int minDistance(String word1, String word2) {
        int[][] distances = new int[word1.length() + 1][word2.length() + 1];
        for(int i = 1; i <= word1.length(); i++){
            distances[i][0] = i;
        }
        for(int i = 1; i <= word2.length(); i++){
            distances[0][i] = i;
        }
        for(int i = 1; i <= word1.length(); i++){
            for(int j = 1; j <= word2.length(); j++){
                if(word1.charAt(i - 1) == word2.charAt(j - 1)){
                    distances[i][j] = distances[i - 1][j - 1];
                } else{
                    distances[i][j] = Math.min(Math.min(distances[i - 1][j], distances[i][j - 1]),
                            distances[i - 1][j - 1]) + 1;
                }
            }
        }
        return distances[word1.length()][word2.length()];

    }
}
