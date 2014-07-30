package me.fangjian.leetcode.array.pascaltriangle;

import java.util.ArrayList;
import java.util.List;

/**
 * Created at 7/29/14
 *
 * @author Jian Fang (jfang@rocketfuelinc.com)
 */
public class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<List<Integer>>(numRows);
        for(int i = 0; i < numRows; i++){
            List<Integer> row = new ArrayList<Integer>(i + 1);
            for(int j = 0; j <= i; j++){
                if(i == 0){
                    row.add(1);
                } else {
                    List<Integer> lastRow = result.get(i - 1);
                    if(j == 0 || j == lastRow.size()){
                        row.add(1);
                    } else {
                        row.add(lastRow.get(j) + lastRow.get(j - 1));
                    }
                }
            }
            result.add(row);
        }
        return result;
    }
}
