package offer;

public class OF53_1 {
    public int search(int[] nums, int target) {
        if(nums==null||nums.length==0){
            return 0;
        }
        int first = findFirst(nums, target);
        if(first==-1){
            return 0;
        }
        int last = findLast(nums, target);
        return last-first+1;
    }

    int findFirst(int[] nums,int target){
        int i=0,j=nums.length-1;
        while (i<j){
            int mid=i+(j-i)/2;
            if(nums[mid]==target){
                j=mid;
            }else if(nums[mid]>target){
                j=mid-1;
            }else {
                i=mid+1;
            }
        }
        if(nums[i]==target){
            return i;
        }
        return -1;
    }

    int findLast(int[] nums,int target){
        int i=0,j=nums.length-1;
        while (i<j){
            int mid=i+(j-i+1)/2;
            if(nums[mid]==target){
                i=mid;
            }else if(nums[mid]>target){
                j=mid-1;
            }else {
                i=mid+1;
            }
        }
        return i;
    }
}
