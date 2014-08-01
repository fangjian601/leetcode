package me.fangjian.leetcode.array.stockprofit3;

/**
 * Created at 8/1/14
 *
 * https://oj.leetcode.com/problems/best-time-to-buy-and-sell-stock-iii/
 *
 * @author Jian Fang (jfang@rocketfuelinc.com)
 */
public class Solution {
    public int maxProfit(int[] prices) {
        if(prices.length == 0) return 0;
        int[] maxProfitUntil = new int[prices.length];
        int[] maxProfitFrom = new int[prices.length];
        int buyPrice = prices[0], sellPrice = prices[prices.length - 1], maxProfit = 0;
        for(int i = 0; i < prices.length; i++){
            maxProfit = Math.max(maxProfit, prices[i] - buyPrice);
            maxProfitUntil[i] = maxProfit;
            if(prices[i] < buyPrice) { buyPrice = prices[i]; }
        }
        maxProfit = 0;
        for(int i = prices.length - 1; i >= 0; i--){
            maxProfit = Math.max(maxProfit, sellPrice - prices[i]);
            maxProfitFrom[i] = maxProfit;
            if(prices[i] > sellPrice) { sellPrice = prices[i]; }
        }
        maxProfit = 0;
        for(int i = -1; i < prices.length; i++){
            if(i == -1){
                maxProfit = Math.max(maxProfit, maxProfitFrom[i + 1]);
            } else if(i == prices.length - 1){
                maxProfit = Math.max(maxProfit, maxProfitUntil[i]);
            } else {
                maxProfit = Math.max(maxProfit, maxProfitUntil[i] + maxProfitFrom[i + 1]);
            }
        }
        return maxProfit;
    }
}
