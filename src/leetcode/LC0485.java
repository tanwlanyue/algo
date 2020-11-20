package leetcode;

public class LC0485 {
    public int findMaxConsecutiveOnes(int[] nums) {
        int maxLen=0;
        int len=0;
        for (int num : nums) {
            len=num==1?len+1:0;
            maxLen=Math.max(maxLen,len);
        }
        return maxLen;
    }
}
