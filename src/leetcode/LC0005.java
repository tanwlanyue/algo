package leetcode;


/**
 * FIXME
 */
public class LC0005 {

    public String longestPalindrome(String s) {
        int len = s.length();
        if(len<=1){
            return s;
        }
        int maxLen=1;
        int beginIndex=0;
        boolean[][] dp = new boolean[len][len];
        char[] charArray = s.toCharArray();
        for (int i = 0; i < len; i++) {
            dp[i][i] = true;
        }
        for (int j = 1; j < len; j++) {
            for (int i = 0; i < j; i++) {
                if(charArray[i]!=charArray[j]){
                    dp[i][j]=false;
                }else {
                    if(j-i<3){
                        dp[i][j]=true;
                    }else {
                        dp[i][j]=dp[i+1][j-1];
                    }
                }
                if(dp[i][j]&&j-i+1>maxLen){
                    maxLen=j-i+1;
                    beginIndex=i;
                }

            }
        }
        return s.substring(beginIndex,beginIndex+maxLen);
    }
}
