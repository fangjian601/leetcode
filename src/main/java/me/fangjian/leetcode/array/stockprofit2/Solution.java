package me.fangjian.leetcode.array.stockprofit2;

/**
 * Created at 7/29/14
 *
 * https://oj.leetcode.com/problems/best-time-to-buy-and-sell-stock-ii/
 *
 * @author Jian Fang (jfang@rocketfuelinc.com)
 */
public class Solution {
    public int maxProfit(int[] prices) {
        int sum = 0;
        for(int i = 0; i < prices.length - 1; i++){
            if(prices[i] < prices[i + 1]){
                sum += (prices[i + 1] - prices[i]);
            }
        }
        return sum;
    }
}
