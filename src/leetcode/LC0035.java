package leetcode;

public class LC0035 {

    public int searchInsert(int[] nums, int target) {
        int length = nums.length;
        if(length==0){
            return 0;
        }
        if(nums[length-1]<target){
            return length;
        }
        int left=0;
        int right=length-1;
        while (left<right){
            int mid=left+(right-left)/2;
            if(nums[mid]<target){
                left=mid+1;
            }else {
                right=mid;
            }
        }
        return left;
    }
}
