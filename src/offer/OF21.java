package offer;

public class OF21 {

    public int[] exchange(int[] nums) {
        int lRange=0,rRange=nums.length-1;
        int i=0;
        while (i<nums.length&&lRange<rRange){
            if(nums[i]%2==1){
                swap(nums,i++,lRange++);
            }else {
                swap(nums,i++,rRange--);
            }
        }
        return nums;
    }

    void swap(int[] nums,int i,int j){
        int tmp=nums[i];
        nums[i]=nums[j];
        nums[j]=tmp;
    }
}
