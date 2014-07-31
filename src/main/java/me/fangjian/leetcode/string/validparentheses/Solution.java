package me.fangjian.leetcode.string.validparentheses;

import java.util.Stack;

/**
 * Created at 7/30/14
 *
 * https://oj.leetcode.com/problems/valid-parentheses/
 *
 * @author Jian Fang (jfang@rocketfuelinc.com)
 */
public class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<Character>();
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{'){
                stack.push(s.charAt(i));
            } else {
                if(stack.isEmpty() ||
                   (s.charAt(i) == ')' && stack.peek() != '(') ||
                   (s.charAt(i) == ']' && stack.peek() != '[') ||
                   (s.charAt(i) == '}' && stack.peek() != '{')){
                    return false;
                } else {
                    stack.pop();
                }
            }
        }
        return stack.isEmpty();
    }
}
