package leetcode;

/**
 * 100.00%
 * 84.78%
 */
public class LC0476 {
    // x^1s=~x
    public int findComplement(int num) {
        int mask = num;
        mask |= mask >> 1;
        mask |= mask >> 2;
        mask |= mask >> 4;
        mask |= mask >> 8;
        mask |= mask >> 16;
        return (mask ^ num);
    }
}
