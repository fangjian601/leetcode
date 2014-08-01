package me.fangjian.leetcode.string.distinctsub;

/**
 * Created at 8/1/14
 *
 * https://oj.leetcode.com/problems/distinct-subsequences/
 *
 * @author Jian Fang (jfang@rocketfuelinc.com)
 */
public class Solution {
    public int numDistinct(String S, String T) {
        if(T.length() == 0) { return 1; }
        if(S.length() == 0) { return 0; }
        int[][] counts = new int[S.length()][T.length()];
        for(int i = 0; i < S.length(); i++){
            if(S.charAt(i) == T.charAt(0)){
                if(i > 0) {
                    counts[i][0] = 1 + counts[i - 1][0];
                } else {
                    counts[i][0] = 1;
                }
            } else if(i > 0) {
                counts[i][0] = counts[i - 1][0];
            }
        }
        for(int i = 1; i < S.length(); i++){
            for(int j = 1; j < T.length(); j++){
                if(S.charAt(i) == T.charAt(j)){
                    counts[i][j] = counts[i - 1][j - 1] + counts[i - 1][j];
                } else {
                    counts[i][j] = counts[i - 1][j];
                }
            }
        }
        return counts[S.length() - 1][T.length() - 1];
    }
}
