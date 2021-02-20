package leetcode;

public class LC0041 {

    public int firstMissingPositive(int[] nums) {
        int length = nums.length;
        boolean[] arr = new boolean[length];
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]>0&&nums[i]<=length){
                arr[nums[i]-1]=true;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if(!arr[i]){
                return i+1;
            }
        }
        return length+1;
    }
}
