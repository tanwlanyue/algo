package util;

public class Method {
    public static void swap(int[] nums, int i, int j) {
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }

    public static void print(int[] nums){
        for (int num : nums) {
            System.out.print(num+" ");
        }
    }
}
