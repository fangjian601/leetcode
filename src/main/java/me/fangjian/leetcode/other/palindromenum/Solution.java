package me.fangjian.leetcode.other.palindromenum;

/**
 * Created at 7/17/14
 *
 * https://oj.leetcode.com/problems/palindrome-number/
 *
 * @author Jian Fang (jfang@rocketfuelinc.com)
 */
public class Solution {
    private int tenPow(int e){
        int mul = 1;
        while(e != 0){
            mul *= 10;
            e--;
        }
        return mul;
    }

    private int numLength(int x){
        int remain = x;
        int length = 0;
        while(remain != 0){
            length++;
            remain = remain / 10;
        }
        return length;
    }

    private int digitAt(int x, int index){
        return (x / tenPow(index)) % 10;
    }

    public boolean isPalindrome(int x) {
        if(x < 0) return false;
        int length = numLength(x);
        for(int i = 0, j = length - 1; i < j; i++, j--){
            if(digitAt(x, i) != digitAt(x, j)){
                return false;
            }
        }
        return true;
    }
}
