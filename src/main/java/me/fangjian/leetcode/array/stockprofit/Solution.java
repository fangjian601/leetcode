package me.fangjian.leetcode.array.stockprofit;

/**
 * Created at 7/25/14
 *
 * https://oj.leetcode.com/problems/best-time-to-buy-and-sell-stock/
 *
 * @author Jian Fang (jfang@rocketfuelinc.com)
 */
public class Solution {
    public int maxProfit(int[] prices) {
        if(prices == null || prices.length < 2) return 0;
        int buyPrice = prices[0];
        int maxProfit = 0;
        for(int i = 1; i < prices.length; i++){
            maxProfit = Math.max(maxProfit, prices[i] - buyPrice);
            if(prices[i] < buyPrice) buyPrice = prices[i];
        }
        return maxProfit;
    }
}
