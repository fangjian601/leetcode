package me.fangjian.leetcode.matrix.nqueens2;

import java.util.HashSet;
import java.util.Set;

/**
 * Created at 7/29/14
 *
 * https://oj.leetcode.com/problems/n-queens-ii/
 *
 * @author Jian Fang (jfang@rocketfuelinc.com)
 */
public class Solution {
    private int count = 0;
    private void totalNQueens(int n, int row, int[] queen,
                              Set<Integer> columns, Set<Integer> crossA, Set<Integer> crossB){
        if(row < n){
            for(int i = 0; i < n; i++){
                if((!columns.contains(i)) && (!crossA.contains(i + row)) && (!crossB.contains(i - row))){
                    columns.add(i);
                    crossA.add(i + row);
                    crossB.add(i - row);
                    queen[row] = i;
                    totalNQueens(n, row + 1, queen, columns, crossA, crossB);
                    columns.remove(i);
                    crossA.remove(i + row);
                    crossB.remove(i - row);
                }
            }
        } else {
            count++;
        }
    }
    public int totalNQueens(int n) {
        count = 0;
        totalNQueens(n, 0, new int[n], new HashSet<Integer>(), new HashSet<Integer>(), new HashSet<Integer>());
        return count;
    }
}
