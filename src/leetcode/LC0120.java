package leetcode;

import java.util.List;

public class LC0120 {

    public int minimumTotal(List<List<Integer>> triangle) {
        int size = triangle.size();
        int[][] dp = new int[size][size];
        dp[0][0]=triangle.get(0).get(0);
        for (int i = 1; i < size; i++) {
            dp[i][0]=triangle.get(i).get(0)+dp[i-1][0];
        }
        for (int i = 1; i < size; i++) {
            for (int j = 1; j < triangle.get(i).size(); j++) {
                dp[i][j]=Math.min(dp[i-1][j-1],dp[i-1][j])+triangle.get(i).get(j);
            }
        }
        int min=dp[size-1][0];
        for (int i = 1; i < size; i++) {
            min=Math.min(min,dp[size-1][i]);
        }
        return min;
    }
}
