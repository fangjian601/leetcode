package me.fangjian.leetcode.other.combinations;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Created at 7/30/14
 *
 * https://oj.leetcode.com/problems/combinations/
 *
 * @author Jian Fang (jfang@rocketfuelinc.com)
 */
public class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        List<Integer> queue = new LinkedList<Integer>();
        if(n > 0){
            boolean back = false;
            queue.add(1);
            while(!queue.isEmpty()){
                if(back){
                    int tail = queue.get(queue.size() - 1);
                    queue.remove(queue.size() - 1);
                    if(tail != n){
                        queue.add(tail + 1);
                        back = false;
                    }
                } else {
                    if(queue.size() == k){
                        result.add(new ArrayList<Integer>(queue));
                        back = true;
                    } else {
                        int tail = queue.get(queue.size() - 1);
                        if(tail == n){
                            back = true;
                        } else {
                            queue.add(tail + 1);
                        }
                    }
                }
            }
        }
        return result;
    }
}
