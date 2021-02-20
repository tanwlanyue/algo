package leetcode;

public class LC0034 {

    public int[] searchRange(int[] nums, int target) {
        if(nums.length==0){
            return new int[]{-1,-1};
        }
        int left = findLeft(nums, target);
        if(left==-1){
            return new int[]{-1,-1};
        }
        int right = findRight(nums, target);
        return new int[]{left,right};
    }

    int findLeft(int[] nums,int target){
        int i=0,j=nums.length-1;
        while (i<j){
            int mid=i+(j-i)/2;
            if(nums[mid]>target){
                j=mid-1;
            }else if(nums[mid]<target){
                i=mid+1;
            }else {
                j=mid;
            }
        }
        if(nums[i]==target){
            return i;
        }
        return -1;
    }

    int findRight(int[] nums,int target){
        int i=0,j=nums.length-1;
        while (i<j){
            int mid=i+(j-i+1)/2;//+1 取偏右mid
            if(nums[mid]>target){
                j=mid-1;
            }else if(nums[mid]<target){
                i=mid+1;
            }else {
                i=mid;
            }
        }
        return i;
    }
}
