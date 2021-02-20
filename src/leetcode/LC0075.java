package leetcode;

/**
 * 100.00%
 * 88.77%
 */
public class LC0075 {
    public void sortColors(int[] nums) {
        int left=-1;
        int right=nums.length;
        for (int i = 0; i <= right; i++) {
            if(nums[i]==0){
                nums[i]=nums[++left];
                nums[left]=0;
            }else if(nums[i]==2){
                nums[i]=nums[--right];
                nums[right]=2;
            }
        }
    }

}
