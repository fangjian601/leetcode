package me.fangjian.leetcode.string.palindromepartition;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Created at 7/31/14
 *
 * https://oj.leetcode.com/problems/palindrome-partitioning/
 *
 * @author Jian Fang (jfang@rocketfuelinc.com)
 */
public class Solution {
    private boolean isPalindrome(String s){
        if(s.length() < 2) {return true;}
        int i = 0, j = s.length() - 1;
        while(i < j){
            if(s.charAt(i) != s.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    private void partition(String s, int start, List<List<String>> result, List<String> current){
        if(start == s.length() && current.size() > 0){
            result.add(new ArrayList<String>(current));
        } else if(start < s.length()){
            for(int i = start; i < s.length(); i++){
                String sub = s.substring(start, i + 1);
                if(isPalindrome(sub)){
                    current.add(sub);
                    partition(s, i + 1, result, current);
                    current.remove(current.size() - 1);
                }
            }
        }
    }

    public List<List<String>> partition(String s) {
        List<List<String>> result = new ArrayList<List<String>>();
        partition(s, 0, result, new LinkedList<String>());
        return result;
    }
}
