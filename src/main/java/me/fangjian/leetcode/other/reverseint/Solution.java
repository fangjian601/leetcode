package me.fangjian.leetcode.other.reverseint;

/**
 * Created at 7/29/14
 *
 * https://oj.leetcode.com/problems/reverse-integer/
 *
 * @author Jian Fang (jfang@rocketfuelinc.com)
 */
public class Solution {
    public int reverse(int x) {
        int reversed = 0;
        int divider = 1000000000;
        int mul = 1;
        for(int i = 0; i < 10; i++){
            int digit = x / divider;
            if(digit != 0){
                for(int j = i; j < 10; j++){
                    digit = x / divider;
                    reversed += (digit * mul);
                    x = (x % divider);
                    divider /= 10;
                    mul *= 10;

                }
                break;
            }
            divider /= 10;
        }
        return reversed;
    }
}
