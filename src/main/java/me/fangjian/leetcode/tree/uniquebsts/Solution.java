package me.fangjian.leetcode.tree.uniquebsts;

/**
 * Created at 7/29/14
 *
 * https://oj.leetcode.com/problems/unique-binary-search-trees/
 *
 * @author Jian Fang (jfang@rocketfuelinc.com)
 */
public class Solution {
    public int numTrees(int n) {
        if(n == 0){
            return 0;
        }
        int[] counts = new int[n + 1];
        counts[0] = 1;
        counts[1] = 1;
        for(int i = 2; i <= n; i++){
            for(int j = 0; j < i; j++){
                counts[i] += (counts[j] * counts[i - j - 1]);
            }
        }
        return counts[n];
    }
}
