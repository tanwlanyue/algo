package leetcode;

public class LC0309 {

    public int maxProfit(int[] prices) {
        if(prices.length==0){
            return 0;
        }
        int length = prices.length;
        int[][] dp = new int[prices.length][3];//[i][0]当前持有累计最大收益 [i][1]当前不持有处于冷冻期累计最大收益 [i][2]当前不持有也不出于冷冻期 最大收益
        dp[0][0]=-prices[0];
        for (int i = 1; i < length; i++) {
            dp[i][0]=Math.max(dp[i-1][0],dp[i-1][2]+(-prices[i]));
            dp[i][1]=dp[i-1][0]+prices[i];// 卖出
            dp[i][2]=Math.max(dp[i-1][1],dp[i-1][2]);
        }
        return Math.max(dp[length-1][1],dp[length-1][2]);
    }
}
