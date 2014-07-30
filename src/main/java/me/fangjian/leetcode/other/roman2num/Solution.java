package me.fangjian.leetcode.other.roman2num;

/**
 * Created at 7/29/14
 *
 * https://oj.leetcode.com/problems/roman-to-integer/
 *
 * @author Jian Fang (jfang@rocketfuelinc.com)
 */
public class Solution {
    private static String[] digits =
        new String[]{"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
    private static int[] numbers =
        new int[]{1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};

    private int findNumber(String digit){
        for(int i = 0; i < digits.length; i++){
            if(digits[i].equals(digit)){
                return numbers[i];
            }
        }
        return -1;
    }

    public int romanToInt(String s) {
        int index = 0;
        int sum = 0;
        while(index < s.length()){
            if(index < s.length() - 1){
                String digit = s.substring(index, index + 2);
                int number = findNumber(digit);
                if(number != -1){
                    sum += number;
                    index += 2;
                    continue;
                }
            }
            String digit = s.substring(index, index + 1);
            sum += findNumber(digit);
            index++;
        }
        return sum;
    }
}
