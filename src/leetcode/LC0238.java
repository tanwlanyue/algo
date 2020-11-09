package leetcode;

public class LC0238 {

    public int[] productExceptSelf(int[] nums) {
        int[] res = new int[nums.length];
        int p = 1, q = 1;
        // 下三角
        for (int i = 0; i < nums.length; i++) {
            res[i] = p;
            p =p*nums[i];
        }
        // 上三角
        for (int i = nums.length - 1; i > 0; i--) {
            q =q*nums[i];
            res[i - 1] =res[i-1]*q;
        }
        return res;
    }
}