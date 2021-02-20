package leetcode;

import java.util.Random;

/**
 * 95.05%
 * 67.67%
 */
public class LC0384 {
}
class Solution {

    int[] reset;
    int[] nums;
    public Solution(int[] nums) {
        reset = new int[nums.length];
        this.nums=nums;
        System.arraycopy(nums,0,reset,0,nums.length);
    }

    Random rand = new Random();

    private int randRange(int min, int max) {
        return rand.nextInt(max - min) + min;
    }

    /** Resets the array to its original configuration and return it. */
    public int[] reset() {
        System.arraycopy(reset,0,nums,0,nums.length);
        return nums;
    }

    /** Returns a random shuffling of the array. */
    public int[] shuffle() {
        for (int i = 0; i < nums.length; i++) {
            swap(i, randRange(i, nums.length));
        }
        return nums;
    }

    private void swap(int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

}