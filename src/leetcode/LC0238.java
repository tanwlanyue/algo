package leetcode;

public class LC0238 {
    //    a       b       c     d
    //p:  1       1*a     a*b   a*b*c
    //q:  b*c*d   c*d     d     1
    public int[] productExceptSelf(int[] nums) {
        int[] ret = new int[nums.length];
        int p=1,q=1;
        for (int i = 0; i < nums.length; i++) {
            ret[i]=p;
            p*=nums[i];
        }

        for (int i = nums.length-1; i >0; i--) {
            q*=nums[i];
            ret[i-1]*=q;
        }
        return ret;
    }
}