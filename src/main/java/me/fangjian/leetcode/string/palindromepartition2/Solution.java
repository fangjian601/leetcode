package me.fangjian.leetcode.string.palindromepartition2;

/**
 * Created at 8/1/14
 *
 * https://oj.leetcode.com/problems/palindrome-partitioning-ii/
 *
 * @author Jian Fang (jfang@rocketfuelinc.com)
 */
public class Solution {
    public int minCut(String s) {
        if(s.length() < 2) { return 0; }
        int[] cuts = new int[s.length()];
        boolean[][] palindrome = new boolean[s.length()][s.length()];
        for(int i = palindrome.length; i >= 0; i--){
            for(int j = i; j < palindrome.length; j++){
                if(i == j){
                    palindrome[i][j] = true;
                } else if(s.charAt(i) != s.charAt(j)){
                    palindrome[i][j] = false;
                } else {
                    if(i + 1 >= j - 1){
                        palindrome[i][j] = true;
                    } else {
                        palindrome[i][j] = palindrome[i + 1][j - 1];
                    }
                }
            }
        }
        cuts[s.length() - 1] = 0;
        for(int i = s.length() - 2; i >= 0; i--){
            if(palindrome[i][s.length() - 1]){
                cuts[i] = 0;
            } else{
                int min = Integer.MAX_VALUE;
                for(int j = i; j < s.length() - 1; j++){
                    if(palindrome[i][j]){
                        min = Math.min(min, 1 + cuts[j + 1]);
                    }
                }
                cuts[i] = min;
            }

        }
        return cuts[0];
    }
}
