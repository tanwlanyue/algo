package offer;

public class OF51 {

    public int reversePairs(int[] nums) {
        int[] copy = new int[nums.length];
        System.arraycopy(nums, 0, copy, 0, nums.length);
        int[] temp = new int[nums.length];
        return reversePairs(copy, 0, nums.length - 1, temp);
    }

    private int reversePairs(int[] nums, int left, int right, int[] temp) {
        if (left == right) {
            return 0;
        }
        int mid = left + (right - left) / 2;
        int leftPairs = reversePairs(nums, left, mid, temp);
        int rightPairs = reversePairs(nums, mid + 1, right, temp);
        int crossPairs = (nums[mid] <= nums[mid + 1]) ? 0 : mergeAndCount(nums, left, mid, right, temp);
        return leftPairs + rightPairs + crossPairs;
    }

    private int mergeAndCount(int[] nums, int left, int mid, int right, int[] temp) {
        if (right + 1 - left >= 0) System.arraycopy(nums, left, temp, left, right + 1 - left);
        int i = left;
        int j = mid + 1;
        int count = 0;
        for (int k = left; k <= right; k++) {
            if (i == mid + 1) {// 左边放完
                nums[k] = temp[j];
                j++;
            } else if (j == right + 1) {//右边放完
                nums[k] = temp[i];
                i++;
                count += (right - mid);
            } else if (temp[i] <= temp[j]) {
                nums[k] = temp[i];
                i++;
                count += (j - mid - 1);
            } else {
                nums[k] = temp[j];
                j++;
            }
        }
        return count;
    }
}
