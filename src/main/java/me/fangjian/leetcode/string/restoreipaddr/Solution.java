package me.fangjian.leetcode.string.restoreipaddr;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created at 8/3/14
 *
 * https://oj.leetcode.com/problems/restore-ip-addresses/
 *
 * @author Jian Fang (jfang@rocketfuelinc.com)
 */
public class Solution {
    private void restoreIpAddresses(String s, int start, int level, String current, Set<String> result){
        int len = s.length() - start;
        if(level == 4 && len == 0){
            result.add(current);
        } else if(level < 4 && len >= 4 - level){
            String dot = "";
            if(current != ""){
                dot = ".";
            }
            String next = s.substring(start, start + 1);
            restoreIpAddresses(s, start + 1, level + 1, current + dot + next, result);
            if(len > 1){
                next = s.substring(start, start + 2);
                if(next.charAt(0) != '0'){
                    restoreIpAddresses(s, start + 2, level + 1, current + dot + next, result);
                }

            }
            if(len > 2 && Integer.valueOf(s.substring(start, start + 3)) < 256){
                next = s.substring(start, start + 3);
                if(next.charAt(0) != '0'){
                    restoreIpAddresses(s, start + 3, level + 1, current + dot + next, result);
                }
            }
        }
    }

    public List<String> restoreIpAddresses(String s) {
        Set<String> result = new HashSet<String>();
        restoreIpAddresses(s, 0, 0, "", result);
        return new ArrayList<String>(result);
    }
}
