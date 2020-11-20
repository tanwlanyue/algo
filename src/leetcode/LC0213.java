package leetcode;

public class LC0213 {

    public int rob(int[] nums) {
        int size = nums.length;
        if(size==0){
            return 0;
        }
        if(size==1){
            return nums[0];
        }

        int a = rob(nums, 0, size - 2);
        int b = rob(nums, 1, size - 1);
        return Math.max(a,b);
    }

    public int rob(int[] nums,int a,int b) {
        if(b-a<0){
            return 0;
        }
        if(b-a==0){
            return nums[0];
        }
        int[] dp = new int[b+1];
        dp[0]=nums[0];
        dp[1]=Math.max(nums[0],nums[1]);
        for (int i = a+2; i <= b; i++) {
            dp[i]=Math.max(dp[i-2]+nums[i],dp[i-1]);
        }
        return dp[b];
    }
}
