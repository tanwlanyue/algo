package leetcode;

public class LC0189 {

    public void rotate(int[] nums, int k) {
        k=k%nums.length;
        reverse(nums,0,nums.length-1);
        reverse(nums,0,k-1);
        reverse(nums,k,nums.length-1);
    }

    private void reverse(int[] nums,int left,int right){
        if(left>right){
            return;
        }
        int mid=left+(right-left)/2;
        for (int i = left; i <= mid; i++) {
            int tmp=nums[i];
            nums[i]=nums[left+right-i];
            nums[left+right-i]=tmp;
        }
    }

}
