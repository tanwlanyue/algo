package leetcode;

public class LC0072 {

    public int minDistance(String word1, String word2) {
        int len1=word1.length();
        int len2=word2.length();
        int[][] dp = new int[len1+1][len2+1];
        for (int k = 1; k <= len1; k++) {
            dp[k][0]=k;
        }
        for (int k = 1; k <= len2; k++) {
            dp[0][k]=k;
        }
        for (int i = 1; i <=len1; i++) {
            for (int j = 1; j <= len2; j++) {
                if(word1.charAt(i-1)==word2.charAt(j-1)){
                    dp[i][j]=dp[i-1][j-1];
                }else {
                    dp[i][j]=Math.min(Math.min(dp[i][j-1]+1,dp[i-1][j]+1),dp[i-1][j-1]+1);//插入 删除 替换
                }
            }
        }
        return dp[len1][len2];
    }
}
