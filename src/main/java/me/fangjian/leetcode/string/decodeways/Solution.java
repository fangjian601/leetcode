package me.fangjian.leetcode.string.decodeways;

/**
 * Created at 7/29/14
 *
 * https://oj.leetcode.com/problems/decode-ways/
 *
 * @author Jian Fang (jfang@rocketfuelinc.com)
 */
public class Solution {

    private boolean isDigit(char ch){
        return ch <= '9' && ch >= '0';
    }

    public int numDecodings(String s) {
        if(s.length() == 0){
            return 0;
        }
        int[] numbers = new int[s.length()];
        if(isDigit(s.charAt(numbers.length - 1)) && s.charAt(numbers.length - 1) != '0'){
            numbers[numbers.length - 1] = 1;
        }
        for(int i = numbers.length - 2; i >= 0; i--){
            if(s.charAt(i) == '0'){
                continue;
            }
            if(isDigit(s.charAt(i))){
                numbers[i] += numbers[i + 1];
            }
            if(isDigit(s.charAt(i)) && isDigit(s.charAt(i + 1))){
                int parsed = Integer.valueOf(s.substring(i, i + 2));
                if(parsed > 0 && parsed < 27){
                    if(i + 2 < numbers.length){
                        numbers[i] += numbers[i + 2];
                    } else {
                        numbers[i] += 1;
                    }
                }
            }
        }
        return numbers[0];
    }
}
