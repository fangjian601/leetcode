package me.fangjian.leetcode.matrix.nqueens;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created at 7/29/14
 *
 * https://oj.leetcode.com/problems/n-queens/
 *
 * @author Jian Fang (jfang@rocketfuelinc.com)
 */
public class Solution {

    private void solveNQueens(int n, int row, List<String[]> results, int[] queen,
                              Set<Integer> columns, Set<Integer> crossA, Set<Integer> crossB){
        if(row < n){
            for(int i = 0; i < n; i++){
                if((!columns.contains(i)) && (!crossA.contains(i + row)) && (!crossB.contains(i - row))){
                    columns.add(i);
                    crossA.add(i + row);
                    crossB.add(i - row);
                    queen[row] = i;
                    solveNQueens(n, row + 1, results, queen, columns, crossA, crossB);
                    columns.remove(i);
                    crossA.remove(i + row);
                    crossB.remove(i - row);
                }
            }
        } else {
            String[] queens = new String[n];
            for(int i = 0; i < n; i++){
                StringBuilder sb = new StringBuilder();
                for(int j = 0; j < n; j++){
                    if(j == queen[i]){
                        sb.append('Q');
                    } else {
                        sb.append('.');
                    }
                }
                queens[i] = sb.toString();
            }
            results.add(queens);
        }
    }

    public List<String[]> solveNQueens(int n) {
        List<String[]> results = new ArrayList<String[]>();
        solveNQueens(n, 0, results, new int[n],
                new HashSet<Integer>(), new HashSet<Integer>(), new HashSet<Integer>());
        return results;
    }
}
