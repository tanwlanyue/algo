package offer;

public class OF53_2 {

    public int missingNumber(int[] nums) {
        int i=0,j=nums.length-1;
        while (i<j){
            int mid=i+(j-i)/2;
            if(nums[mid]==mid){
                i=mid+1;
            }else {
                j=mid;
            }
        }
        return nums[i];
    }
}
