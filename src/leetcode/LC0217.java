package leetcode;

import java.util.HashSet;

public class LC0217 {

    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int num : nums) {
            if(!set.add(num)){
                return true;
            }
        }
        return false;
    }
}
