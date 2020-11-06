package leetcode;

public class LC0338 {
    public int[] countBits(int num) {
        int[] dp = new int[num + 1];
        for (int i = 0; i <= num; i++) {
            dp[i]=(i<=1)?i:dp[i&(i-1)]+1;
        }
        return dp;
    }
}
