package me.fangjian.leetcode.array.largestrect;

import java.util.Stack;

/**
 * Created at 7/30/14
 *
 * https://oj.leetcode.com/problems/largest-rectangle-in-histogram/
 *
 * @author Jian Fang (jfang@rocketfuelinc.com)
 */
public class Solution {
    private class Pair{
        int startIndex;
        int height;
        public Pair(int x, int y){
            startIndex = x;
            height = y;
        }
    }
    public int maxArea(int[] height) {
        int max = 0;
        Stack<Pair> points = new Stack<Pair>();
        int startIndex = 0;
        int i = 0;
        for(; i < height.length; i++){
            startIndex = i;
            while(true){
                if(points.size() == 0 || height[i] > points.peek().height){
                    points.push(new Pair(startIndex, height[i]));
                } else if(height[i] < points.peek().height){
                    Pair point = points.pop();
                    max = Math.max(max, point.height * (i - point.startIndex));
                    startIndex = point.startIndex;
                    continue;
                }
                break;
            }
        }
        while(!points.empty()){
            Pair point = points.pop();
            max = Math.max(max, point.height * (i - point.startIndex));
        }
        return max;
    }
}
