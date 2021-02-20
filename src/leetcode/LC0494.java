package leetcode;

/**
 * 该问题可以转换为 Subset Sum 问题，从而使用 0-1 背包的方法来求解。
 * 可以将这组数看成两部分，P 和 N，其中 P 使用正号，N 使用负号，有以下推导：
 * sum(P) - sum(N) = target
 * sum(P) + sum(N) + sum(P) - sum(N) = target + sum(P) + sum(N)
 * 2 * sum(P) = target + sum(nums)
 * 99.87%
 * 80.63%
 */
public class LC0494 {

    public int findTargetSumWays(int[] nums, int S) {
        int sum=0;
        for (int num : nums) {
            sum+=num;
        }
        if(sum<S||(sum+S)%2==1){
            return 0;
        }
        sum=(sum+S)/2;
        int[] dp = new int[sum + 1];
        dp[0]=1;
        for (int num : nums) {
            for (int i = sum; i >=num ; i--) {
                dp[i]=dp[i]+dp[i-num];
            }
        }
        return dp[sum];
    }
}
