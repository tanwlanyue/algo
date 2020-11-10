package basic;

import static util.Method.print;

public class MergeSort {

    public void sort(int[] nums){
        sort(nums,0,nums.length-1);
    }

    private void sort(int[] nums, int l, int r) {
        if(l>=r){
            return;
        }
        int mid=l+(r-l)/2;
        sort(nums, l, mid);
        sort(nums, mid + 1, r);
        merge(nums,l,mid,r);
    }

    private void merge(int[] nums, int l, int mid, int r) {
        int i=l,j=mid+1,k=0;
        int[] res = new int[r - l + 1];
        while (i<=mid && j<=r){
            res[k++]=nums[i]<nums[j]?nums[i++]:nums[j++];
        }
        if(i!=mid){
            for (int m = j; m <=r; m++) {
                res[k++]=nums[m];
            }
        }
        if(j!=r){
            for (int m = i; m <=mid; m++) {
                res[k++]=nums[m];
            }
        }
        for (int m = l,n=0; m <=r ; m++,n++) {
            nums[m]=res[n];
        }
    }

    public static void main(String[] args) {
        int[] nums = {1,5,9,3,7,8,4,2,6};
        new MergeSort().sort(nums);
        print(nums);
    }
}
