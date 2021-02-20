package leetcode;

public class LC0581 {

    public int findUnsortedSubarray(int[] nums) {
        int baseLeft=0;
        int baseRight=nums.length-1;
        int minInRange=Integer.MAX_VALUE;
        int maxInRange=Integer.MIN_VALUE;
        for (int i = 1; i < nums.length; i++) {
            if(nums[i]<nums[i-1]){
                minInRange=Math.min(nums[i],minInRange);
            }
        }

        for (int i = nums.length-2; i >=0; i--) {
            if(nums[i]>nums[i+1]){
                maxInRange=Math.max(nums[i],maxInRange);
            }
        }

        for (int i = 0; i < nums.length; i++) {
            if(nums[i]>minInRange){
                baseLeft=i;
                break;
            }
        }

        for (int i = nums.length-1; i >=0; i--) {
            if(nums[i]<maxInRange){
                baseRight=i;
                break;
            }
        }
        return baseRight-baseLeft+1;
    }
}
