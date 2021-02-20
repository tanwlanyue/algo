package offer;

import java.util.HashSet;

public class OF61 {

    public boolean isStraight(int[] nums) {
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]==0){
                continue;
            }
            if(!set.add(nums[i])){
                return false;
            }
            min=Math.min(min,nums[i]);
            max=Math.max(max,nums[i]);
        }
        if(max-min>4){
            return false;
        }
        return true;
    }
}
