package leetcode;

/**
 * 计数 排序取中 摩尔投票
 * 99.96%
 * 81.55%
 */
public class LC0169 {

    public int majorityElement(int[] nums) {
        int count=1;
        int pre=nums[0];
        for (int i = 1; i < nums.length; i++) {
            if(nums[i]==pre){
                count++;
            }else {
                if(--count==0){
                    count=1;
                    pre=nums[i];
                }
            }
        }
        return pre;
    }
}
