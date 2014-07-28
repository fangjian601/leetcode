package me.fangjian.leetcode.other.lettercombine;

import java.util.*;

/**
 * Created at 7/27/14
 *
 * https://oj.leetcode.com/problems/letter-combinations-of-a-phone-number/
 *
 * @author Jian Fang (jfang@rocketfuelinc.com)
 */
public class Solution {

    private static Map<Character, String> letterMap = new HashMap<Character, String>();
    static{
        letterMap.put('0', " ");
        letterMap.put('1', "~");
        letterMap.put('2', "abc");
        letterMap.put('3', "def");
        letterMap.put('4', "ghi");
        letterMap.put('5', "jkl");
        letterMap.put('6', "mno");
        letterMap.put('7', "pgrs");
        letterMap.put('8', "tuv");
        letterMap.put('9', "wxyz");
    }



    public List<String> letterCombinations(String digits) {
        List<String> results = new ArrayList<String>();
        Stack<Integer> stack = new Stack<Integer>();
        if(digits.length() > 0){
            boolean back = false;
            while(true){
                if(back){
                    if(stack.size() == 0){
                        break;
                    }
                    int previous = stack.pop();
                    int index = stack.size();
                    String candidates = letterMap.get(digits.charAt(index));
                    if(previous < candidates.length() - 1){
                        stack.push(previous + 1);
                        back = false;
                    }
                } else {
                    if(stack.size() < digits.length()){
                        stack.push(0);
                    } else {
                        StringBuilder sb = new StringBuilder();
                        for(int i = 0; i < stack.size(); i++){
                            String candidates = letterMap.get(digits.charAt(i));
                            char ch = candidates.charAt(stack.get(i));
                            if(ch != '~') sb.append(ch);
                        }
                        results.add(sb.toString());
                        back = true;
                    }
                }
            }
        } else {
            results.add("");
        }
        return results;
    }
}
