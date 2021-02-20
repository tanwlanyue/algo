package leetcode;

/**
 * 100.00%
 * 51.50%
 */
public class LC0026 {

    public int removeDuplicates(int[] nums) {
        int length = nums.length;
        int start=1;
        for (int i = 1; i < length; i++) {
            if(nums[i]!=nums[i-1]){
                nums[start++]=nums[i];
            }
        }
        return start;
    }
}
