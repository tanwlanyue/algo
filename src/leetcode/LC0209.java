package leetcode;

public class LC0209 {

    public int minSubArrayLen(int s, int[] nums) {
        int length = nums.length;
        int left=0,right=0;
        int sum=0;
        int minLen=Integer.MAX_VALUE;
        while (right<length){
            sum+=nums[right];
            right++;
            while (left<=right&&sum>=s){
                minLen=Math.min(minLen,right-left);
                sum-=nums[left];
                left++;
            }
        }
        return minLen==Integer.MAX_VALUE?0:minLen;
    }
}
