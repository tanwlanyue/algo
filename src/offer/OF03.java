package offer;

public class OF03 {

    public int findRepeatNumber(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            while (nums[i]!=i){
                int j=nums[i];
                if(nums[j]==nums[i]){
                    return nums[i];
                }else {
                    swap(nums,i,j);
                }
            }
        }
        return -1;
    }

    void swap(int[] nums,int i,int j){
        int tmp=nums[i];
        nums[i]=nums[j];
        nums[j]=tmp;
    }
}
