package me.fangjian.leetcode.array.singlenumber2;

/**
 * Created at 7/29/14
 *
 * https://oj.leetcode.com/problems/single-number-ii/
 *
 * @author Jian Fang (jfang@rocketfuelinc.com)
 */
public class Solution {
    public int singleNumber(int[] A) {
        int ones = 0, twos = 0, threes = 0;
        for(int i = 0; i < A.length; i++){
            twos |= (ones & A[i]);
            ones ^= A[i];
            threes = (twos & ones);
            ones &= (~threes);
            twos &= (~threes);
        }
        return ones;
    }
}
