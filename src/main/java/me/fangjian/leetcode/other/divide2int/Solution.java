package me.fangjian.leetcode.other.divide2int;

/**
 * Created at 7/25/14
 *
 * @author Jian Fang (jfang@rocketfuelinc.com)
 */
public class Solution {

    public class Division{
        int result;
        int remain;
        public Division(int x, int y){
            result = x;
            remain = y;
        }
    }

    private Division recursive(int dividend, int divisor){
        if(dividend < divisor){
            return new Division(0, divisor);
        }
        if(dividend >= divisor && (dividend >> 1) < divisor){
            return new Division(1, (dividend + (~divisor) + 1));
        }
        Division div = recursive(dividend, (divisor << 1));
        if(div.remain != 0){
            Division remainDiv = recursive(div.remain, divisor);
            return new Division((div.result << 1) + remainDiv.result, remainDiv.remain);
        } else {
            return new Division((div.result << 1), 0);
        }
    }

    public int divide(int dividend, int divisor) {
        if(divisor == 0) throw new ArithmeticException("divide by zero");
        boolean isNegative = (dividend > 0) ^ (divisor > 0);
        if(dividend < 0) dividend = (~dividend) + 1;
        if(divisor < 0) divisor = (~divisor) + 1;
        if(isNegative){
            return (~recursive(dividend, divisor).result) + 1;
        } else {
            return recursive(dividend, divisor).result;
        }
    }
}
