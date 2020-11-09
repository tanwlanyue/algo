package offer;

public class OF53_1 {
    public int search(int[] nums, int target) {
        int i=0,j=nums.length-1;
        boolean isFind=false;
        int mid=-1;
        while (i<=j){
            mid=i+(j-i)/2;
            if(nums[mid]==target){
                isFind=true;
                break;
            }else if(nums[mid]>target){
                j=mid-1;
            }else {
                i=mid+1;
            }
        }
        if (isFind) {
            int cnt=1;
            for (int k = mid+1; k <nums.length; k++) {
                if(nums[k]==target){
                    cnt++;
                }
            }
            for (int k = mid-1; k >=0; k--) {
                if(nums[k]==target){
                    cnt++;
                }
            }
            return cnt;
        }else {
            return 0;
        }
    }
}
