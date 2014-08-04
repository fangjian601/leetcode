package me.fangjian.leetcode.string.multiplystrings;

/**
 * Created at 8/3/14
 *
 * https://oj.leetcode.com/problems/multiply-strings/
 *
 * @author Jian Fang (jfang@rocketfuelinc.com)
 */
public class Solution {
    public String add(String num1, String num2){
        int forward = 0;
        StringBuilder sb = new StringBuilder();
        int len = Math.max(num1.length(), num2.length());
        for(int i = 0; i < len; i++){
            int leftDigit = 0, rightDigit = 0;
            if(i < num1.length()) { leftDigit = num1.charAt(num1.length() - i - 1) - '0'; }
            if(i < num2.length()) { rightDigit = num2.charAt(num2.length() - i - 1) - '0'; }
            if(leftDigit + rightDigit + forward > 9){
                sb.append(leftDigit + rightDigit + forward - 10);
                forward = 1;
            } else {
                sb.append(leftDigit + rightDigit + forward);
                forward = 0;
            }
        }
        if(forward == 1){
            sb.append(forward);
        }
        return sb.reverse().toString();
    }

    public String multiply(String num1, String num2) {
        String result = "";
        for(int i = num1.length() - 1; i >= 0; i--){
            int forward = 0;
            int mul = num1.charAt(i) - '0';
            StringBuilder sb = new StringBuilder();
            for(int j = i; j < num1.length() - 1; j++){
                sb.append("0");
            }
            for(int j = num2.length() - 1; j >= 0; j--){
                int digit = num2.charAt(j) - '0';
                int nextDigit = digit * mul + forward;
                if(nextDigit > 9){
                    forward = nextDigit / 10;
                    nextDigit %= 10;
                } else {
                    forward = 0;
                }
                sb.append(nextDigit);
            }
            if(forward != 0){
                sb.append(forward);
            }
            if(result.length() == 0){
                result = sb.reverse().toString();
            } else {
                result = add(result, sb.reverse().toString());
            }
        }
        for(int i = 0; i < result.length(); i++){
            if(result.charAt(i) != '0'){
                return result.substring(i);
            }
        }
        return "0";
    }
}
