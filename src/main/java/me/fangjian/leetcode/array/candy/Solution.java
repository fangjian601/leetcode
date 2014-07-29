package me.fangjian.leetcode.array.candy;

/**
 * Created at 7/28/14
 *
 * https://oj.leetcode.com/problems/candy/
 *
 * @author Jian Fang (jfang@rocketfuelinc.com)
 */
public class Solution {

    public int candy(int[] ratings) {
        int minSum = ratings.length;
        int startIndex = 0, height = 0;
        for(int i = 0; i < ratings.length - 1;){
            startIndex = i;
            while(i < ratings.length - 1 && ratings[i] < ratings[i + 1]){
                i++;
            }
            height = i - startIndex;
            minSum += (((height + 1) * height) / 2);
            if(i == ratings.length - 1) break;

            startIndex = i;
            while(i < ratings.length - 1 && ratings[i] > ratings[i + 1]){
                i++;
            }
            minSum += (((i - startIndex) * (i - startIndex - 1)) / 2);
            if(height < (i - startIndex)){
                minSum += (i - startIndex - height);
            }

            if(i < ratings.length - 1 && ratings[i] == ratings[i + 1]){
                i++;
            }
        }
        return minSum;
    }
}
