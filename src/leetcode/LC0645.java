package leetcode;

/**
 * 100.00%
 * 21.55%
 */
public class LC0645 {

    public int[] findErrorNums(int[] nums) {
        int[] counter = new int[nums.length+1];
        for (int i: nums) {
            counter[i]++;
        }
        int[] ret = new int[2];
        for (int i = 1; i<counter.length; i++) {
            if (counter[i] == 0) {
                ret[1] = i;
            } else if (counter[i] == 2) {
                ret[0] = i;
            }
        }
        return ret;
    }
}
