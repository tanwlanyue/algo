package basic;

import static util.Method.print;
import static util.Method.swap;

public class QuickSort {

    public void sort(int[] nums){
        sort(nums,0,nums.length-1);
    }

    private void sort(int[] nums, int l, int r) {
        if(l>=r) return;
        swap(nums, r, (int) (Math.random() % (r - l + 1)) + l);
        int pivot=partition(nums,l,r);
        sort(nums,l,pivot-1);
        sort(nums,pivot+1,r);
    }

    private int partition(int[] nums, int l, int r) {
        int val=nums[r];
        int j=l;
        for (int i = l; i <r; i++) {
            if(nums[i]<val){
                swap(nums,i,j++);
            }
        }
        swap(nums,r,j);
        return j;
    }

    public static void main(String[] args) {
        int[] nums = {1,5,9,3,7,8,4,2,6};
        new QuickSort().sort(nums);
        print(nums);
    }
}
