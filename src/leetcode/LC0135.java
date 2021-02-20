package leetcode;

/**
 * TODO
 */
public class LC0135 {

    public int candy(int[] ratings) {
        int[] dp = new int[ratings.length];
        dp[0]=1;
        int min=dp[0];
        int ret=0;
        ret+=dp[0];
        for (int i = 1; i < ratings.length; i++) {
            if(ratings[i]>ratings[i-1]){
                dp[i]=dp[i-1]+1;
            }else if(ratings[i]==ratings[i-1]) {
                dp[i]=1;
            }else {
                dp[i]=dp[i-1]-1;
            }
            ret+=dp[i];
            min=Math.min(dp[i],min);
        }
        ret-=(min-1)*ratings.length;
        return ret;
    }
}
