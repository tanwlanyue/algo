package leetcode;

public class LC0912 {

    public int[] sortArray(int[] nums) {
        quickSort(nums,0,nums.length-1);
        return nums;
    }

    private void quickSort(int[] nums, int i, int j) {
        if(i>=j){
            return;
        }
        int pivot=partition(nums,i,j);
        quickSort(nums,i,pivot-1);
        quickSort(nums,pivot+1,j);
    }

    private int partition(int[] nums, int left, int right) {
        int num=nums[right];
        int index=left;
        for (int i = left; i < right; i++) {
            if(nums[i]<num){
                swap(nums,i,index++);
            }
        }
        swap(nums,right,index);
        return index;
    }

    private void swap(int[] nums,int i,int j){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
}
