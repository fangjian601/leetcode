package me.fangjian.leetcode.string.reversewords;

import java.util.Stack;

/**
 * Created at 8/3/14
 *
 * https://oj.leetcode.com/problems/reverse-words-in-a-string/
 *
 * @author Jian Fang (jfang@rocketfuelinc.com)
 */
public class Solution {
    public String reverseWords(String s) {
        int start = 0;
        Stack<String> words =  new Stack<String>();
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) != ' ' && (i == 0 || s.charAt(i - 1) == ' ')){
                start = i;
            }
            if(s.charAt(i) != ' ' && i == s.length() - 1){
                words.push(s.substring(start));
            }
            if(s.charAt(i) == ' ' && i > 0 && s.charAt(i - 1) != ' '){
                words.push(s.substring(start, i));
            }
        }
        boolean first = true;
        StringBuilder sb = new StringBuilder();
        while(!words.empty()){
            if(!first){
                sb.append(" ");
                sb.append(words.pop());
            } else {
                sb.append(words.pop());
                first = false;
            }
        }
        return sb.toString();
    }
}
