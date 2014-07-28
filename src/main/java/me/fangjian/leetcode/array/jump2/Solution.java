package me.fangjian.leetcode.array.jump2;

/**
 * Created at 7/27/14
 *
 * https://oj.leetcode.com/problems/jump-game-ii/
 *
 * @author Jian Fang (jfang@rocketfuelinc.com)
 */
public class Solution {
    public int jump(int[] A) {
        int step = 0, lastMaxDist = 0, currentMaxDist = 0;
        for(int i = 0; i < A.length; i++){
            if(i > lastMaxDist){
                if(lastMaxDist == currentMaxDist && i < A.length - 1){
                    return -1;
                }
                lastMaxDist = currentMaxDist;
                step++;
            }
            currentMaxDist = Math.max(currentMaxDist, i + A[i]);
        }
        return step;
    }
}
