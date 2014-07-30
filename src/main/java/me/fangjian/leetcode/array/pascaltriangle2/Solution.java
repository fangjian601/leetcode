package me.fangjian.leetcode.array.pascaltriangle2;

import java.util.Arrays;
import java.util.List;

/**
 * Created at 7/30/14
 *
 * https://oj.leetcode.com/problems/pascals-triangle-ii/
 *
 * @author Jian Fang (jfang@rocketfuelinc.com)
 */
public class Solution {
    public List<Integer> getRow(int rowIndex) {
        Integer[] row = new Integer[rowIndex + 1];
        for(int i = 0; i <= rowIndex; i++){
            for(int j = i; j >= 0; j--){
                if(j == i || j == 0){
                    row[j] = 1;
                } else {
                    row[j] = row[j] + row[j - 1];
                }
            }
        }
        return Arrays.asList(row);
    }
}
