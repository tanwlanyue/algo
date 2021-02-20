package leetcode;

/**
 * 99.93%
 * 88.67%
 */
public class LC0136 {

    public int singleNumber(int[] nums) {
        int ret=0;
        for (int num : nums) {
            ret^=num;
        }
        return ret;
    }
}
