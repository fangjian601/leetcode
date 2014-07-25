package me.fangjian.leetcode.other.generateparentheses;

import java.util.ArrayList;
import java.util.List;

/**
 * Created at 7/24/14
 *
 * https://oj.leetcode.com/problems/generate-parentheses/
 *
 * @author Jian Fang (jfang@rocketfuelinc.com)
 */
public class Solution {

    public void recursive(int left, int right, StringBuilder sb, List<String> result){
        if(left == 0 && right == 0){
            if(sb.length() != 0){
                result.add(sb.toString());
            }
        } else{
            if(left > 0){
                recursive(left - 1, right, sb.append("("), result);
                sb.deleteCharAt(sb.length() - 1);
            }
            if(left < right){
                recursive(left, right - 1, sb.append(")"), result);
                sb.deleteCharAt(sb.length() - 1);
            }
        }
    }

    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<String>();
        recursive(n, n, new StringBuilder(), result);
        return result;
    }
}
