package leetcode;

public class LC0010 {

    public boolean isMatch(String s, String p) {
        int sLen=s.length();
        int pLen=p.length();
        boolean[][] dp = new boolean[sLen + 1][pLen + 1];
        dp[0][0]=true;

        char[] sArray = s.toCharArray();
        char[] pArray = p.toCharArray();
        for(int i = 2 ; i <= pLen ; i ++){
            if(pArray[i-1] == '*'){
                dp[0][i] = dp[0][i-2];
            }
        }
        for (int i = 1; i <= sLen; i++) {
            for (int j = 1; j <=pLen ; j++) {
                if(sArray[i-1]==pArray[j-1]||pArray[j-1]=='.'){  // ab a.
                    dp[i][j]=dp[i-1][j-1];
                }else if(pArray[j-1]=='*'){
                    if(sArray[i-1]==pArray[j-2]||pArray[j-2]=='.'){ //##b , ###b*       ##b , ###.*
                        dp[i][j]=dp[i][j-1] || dp[i][j-2] || dp[i-1][j];// 单个字符匹配的情况  没有匹配的情况  多个字符匹配的情况
                    }else {  // ab abc*
                        dp[i][j]=dp[i][j-2];
                    }
                }
            }
        }
        return dp[sLen][pLen];
    }
}
