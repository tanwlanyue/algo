package leetcode;

public class LC0122 {

    public int maxProfit(int[] prices) {
        int maxProfit=0;
        for (int i = 1; i < prices.length; i++) {
            int minus=prices[i]-prices[i-1];
            if(minus>0){
                maxProfit+=minus;
            }
        }
        return maxProfit;
    }
}
