package leetcode;

/**
 * 98.18%
 * 79.40%
 */
public class LC0152 {
    public int maxProduct(int[] nums) {
        int length = nums.length;
        int[] maxDP = new int[length];
        int[] minDP = new int[length];
        minDP[0]=nums[0];
        maxDP[0]=nums[0];
        for (int i = 1; i < nums.length; i++) {
            maxDP[i]=Math.max(nums[i],Math.max(maxDP[i-1]*nums[i],minDP[i-1]*nums[i]));
            minDP[i]=Math.min(nums[i],Math.min(maxDP[i-1]*nums[i],minDP[i-1]*nums[i]));
        }
        int ans = Integer.MIN_VALUE;
        for (int i : maxDP) {
            ans=Math.max(ans,i);
        }
        return ans;
    }
}
