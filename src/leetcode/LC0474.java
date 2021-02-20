package leetcode;

/**
 * 78.99%
 * 97.89%
 */
public class LC0474 {

    private int[] countZeroAndOne(String str) {
        int[] cnt = new int[2];
        for (char c : str.toCharArray()) {
            cnt[c - '0']++;
        }
        return cnt;
    }

    public int findMaxForm(String[] strs, int m, int n) {
        int length = strs.length;
        int[][] dp = new int[m + 1][n + 1];
        for (String str : strs) {
            int[] zeroAndOne  = countZeroAndOne(str);
            int zeros = zeroAndOne[0];
            int ones = zeroAndOne[1];
            for (int i = m; i >=zeros; i--) {
                for (int j = n; j>=ones; j--) {
                    dp[i][j] = Math.max(dp[i][j], dp[i - zeros][j - ones] + 1);
                }
            }
        }
        return dp[m][n];
    }
}
