package me.fangjian.leetcode.array.jump;

/**
 * Created at 7/29/14
 *
 * https://oj.leetcode.com/problems/jump-game/
 *
 * @author Jian Fang (jfang@rocketfuelinc.com)
 */
public class Solution {
    public boolean canJump(int[] A) {
        int lastMaxDistance = 0, currentMaxDistance = 0;
        for(int i = 0; i < A.length; i++){
            if(i > lastMaxDistance){
                if(lastMaxDistance == currentMaxDistance){
                    return false;
                }
                lastMaxDistance = currentMaxDistance;
            }
            currentMaxDistance = Math.max(currentMaxDistance, i + A[i]);
        }
        return true;
    }
}
