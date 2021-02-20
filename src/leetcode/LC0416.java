package leetcode;

/**
 * 可以看成一个背包大小为 sum/2 的 0-1 背包问题
 * 79.98%
 * 81.88%
 */
public class LC0416 {
    public boolean canPartition(int[] nums) {
        int sum=0;
        for (int num : nums) {
            sum+=num;
        }
        if(sum%2!=0){
            return false;
        }
        int target=sum/2;
        boolean[] dp = new boolean[target + 1];
        dp[0]=true;
        for (int num : nums) {
            for (int i = target; i >=num ; i--) {
                dp[i]=dp[i]||dp[i-num];
            }
        }
        return dp[target];
    }
}
