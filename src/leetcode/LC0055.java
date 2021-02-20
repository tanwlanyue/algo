package leetcode;

/**
 * 81.02%
 * 93.24%
 */
public class LC0055 {

    public boolean canJump(int[] nums) {
        int rightMost=0;
        for (int i = 0; i < nums.length; i++) {
            if(i>rightMost){
                return false;
            }
            rightMost=Math.max(rightMost,i+nums[i]);
            if(rightMost>=nums.length-1){
                return true;
            }
        }
        return false;
    }
}
