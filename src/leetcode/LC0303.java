package leetcode;

public class LC0303 {

    class NumArray {

        int[] dp;

        public NumArray(int[] nums) {
            dp=new int[nums.length];
            if(nums.length!=0){
                dp[0]=nums[0];
                for (int i = 1; i < nums.length; i++) {
                    dp[i]=dp[i-1]+nums[i];
                }
            }
        }

        public int sumRange(int i, int j) {
            return i==0?dp[j]:dp[j]-dp[i-1];
        }
    }

}
