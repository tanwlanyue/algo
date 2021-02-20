package leetcode;

public class LC1493 {

    public int longestSubarray(int[] nums) {
        int length = nums.length;
        int left=0,right=0;
        int zeroCount=0;
        int maxLen=0;
        while (right<length){
            if(nums[right]==0){
                zeroCount++;
            }
            right++;
            if(zeroCount<=1){
                maxLen = Math.max(maxLen, right - left);
            }
            while (zeroCount>1){
                if(nums[left]==0){
                    zeroCount--;
                }
                left++;
            }
        }
        return maxLen-1;
    }

    public static void main(String[] args) {
        System.out.println(new LC1493().longestSubarray(new int[]{1, 1, 0, 1}));
    }
}
