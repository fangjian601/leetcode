package me.fangjian.leetcode.other.graycode;

import java.util.ArrayList;
import java.util.List;

/**
 * Created at 7/17/14
 *
 * https://oj.leetcode.com/problems/gray-code/
 *
 * @author Jian Fang (jfang@rocketfuelinc.com)
 */
public class Solution {

    public List<Integer> grayCode(int n) {
        List<Integer> result = new ArrayList<Integer>();
        result.add(0);
        for(int i = 0; i < n; i++){
            for(int j = result.size() - 1; j >= 0; j--){
                result.add(result.get(j) | (1 << i));
            }
        }
        return result;
    }
}
