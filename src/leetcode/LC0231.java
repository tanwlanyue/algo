package leetcode;

/**
 * 100.00%
 * 79.17%
 */
public class LC0231 {

    public boolean isPowerOfTwo(int n) {
        return (n>0)&&((n&(n-1))==0);
    }
}
