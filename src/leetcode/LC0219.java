package leetcode;

import java.util.HashMap;

/**
 * 61.65%
 * 32.75%
 */
public class LC0219 {

    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            Integer index = map.get(num);
            if (index == null) {
                map.put(nums[i], i);
            } else if (i - index <= k) {
                return true;
            } else {
                map.put(num, i);
            }
        }
        return false;
    }
}
