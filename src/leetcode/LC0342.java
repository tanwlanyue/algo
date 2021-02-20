package leetcode;

/**
 * 100.00%
 * 39.75%
 */
public class LC0342 {

    public boolean isPowerOfFour(int n) {
        return (n > 0) && ((n & (n - 1)) == 0) && ((n & 0xaaaaaaaa) == 0);
    }
}
