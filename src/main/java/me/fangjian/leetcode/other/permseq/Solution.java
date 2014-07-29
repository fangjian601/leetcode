package me.fangjian.leetcode.other.permseq;

import java.util.LinkedList;
import java.util.List;

/**
 * Created at 7/28/14
 *
 * https://oj.leetcode.com/problems/permutation-sequence/
 *
 * @author Jian Fang (jfang@rocketfuelinc.com)
 */
public class Solution {

    private int factorial(int n){
        int fact = 1;
        for(int i = 1; i <= n; i++){
            fact *= i;
        }
        return fact;
    }

    public String getPermutation(int n, int k) {
        StringBuilder sb = new StringBuilder();
        List<String> digits = new LinkedList<String>();
        for(int i = 1; i <= n; i++){
            digits.add(String.valueOf(i));
        }
        int length = 0;
        k--;
        while(length < n){
            int divider = factorial(n - 1 - length);
            int index = k / divider;
            sb.append(digits.get(index));
            digits.remove(index);
            length++;
            k = k % divider;
        }
        return sb.toString();
    }
}
