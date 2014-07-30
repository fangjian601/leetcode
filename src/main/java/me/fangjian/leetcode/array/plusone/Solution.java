package me.fangjian.leetcode.array.plusone;

/**
 * Created at 7/29/14
 *
 * https://oj.leetcode.com/problems/plus-one/
 *
 * @author Jian Fang (jfang@rocketfuelinc.com)
 */
public class Solution {
    public int[] plusOne(int[] digits) {
        int forward = 1;
        for(int i = digits.length - 1; i >= 0 ; i--){
            if(digits[i] + forward < 10){
                digits[i] = digits[i] + forward;
                forward = 0;
                break;
            } else {
                digits[i] = digits[i] + forward - 10;
                forward = 1;
            }
        }
        if(forward == 0){
            return digits;
        } else {
            int[] newDigits = new int[digits.length + 1];
            for(int i = 1; i <= digits.length; i++){
                newDigits[i] = digits[i - 1];
            }
            newDigits[0] = 1;
            return newDigits;
        }
    }
}
