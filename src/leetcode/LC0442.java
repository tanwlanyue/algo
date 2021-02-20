package leetcode;

import java.util.ArrayList;
import java.util.List;

public class LC0442 {

    public List<Integer> findDuplicates(int[] nums) {
        ArrayList<Integer> ret = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            int num = Math.abs(nums[i]);
            int index=num-1;
            if(nums[index]<0){
                ret.add(index+1);
            }
            nums[index]=-nums[index];
        }
        return ret;
    }
}
