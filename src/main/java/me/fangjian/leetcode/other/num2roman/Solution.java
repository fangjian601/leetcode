package me.fangjian.leetcode.other.num2roman;

import java.util.Map;
import java.util.TreeMap;

/**
 * Created at 7/28/14
 *
 * https://oj.leetcode.com/problems/integer-to-roman/
 *
 * @author Jian Fang (jfang@rocketfuelinc.com)
 */
public class Solution {
    private static int[] marks = new int[]{1000, 500, 100, 50, 10, 5, 1};
    private static String[] largeDigits = new String[]{"M", "D", "C", "L", "X", "V", "I"};

    public String intToRoman(int num) {
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < marks.length && num != 0; i += 2){
            int digit = num / marks[i];
            if(digit == 4){
                sb.append(largeDigits[i]);
                sb.append(largeDigits[i - 1]);
            } else if(digit == 9){
                sb.append(largeDigits[i]);
                sb.append(largeDigits[i - 2]);
            } else if(digit == 5){
                sb.append(largeDigits[i - 1]);
            } else if(digit < 5){
                for(int j = 0; j < digit; j++){
                    sb.append(largeDigits[i]);
                }
            } else {
                sb.append(largeDigits[i - 1]);
                for(int j = 0; j < digit - 5; j++){
                    sb.append(largeDigits[i]);
                }
            }
            num = num % marks[i];
        }
        return sb.toString();
    }
}
