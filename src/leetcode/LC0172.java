package leetcode;

/**
 * 100.00%
 * 70.03%
 */
public class LC0172 {

    public int trailingZeroes(int n) {
        int ret=n/10*2;
        n=n%10;
        return (n>=5)?ret+1:ret;
    }
}
