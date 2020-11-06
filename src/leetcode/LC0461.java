package leetcode;

/**
 * 对两个数进行异或操作，位不同则为1
 */
public class LC0461 {
    public int hammingDistance(int x, int y) {
        int res=0;
        int z=x^y;
        while (z>0){
            z=z&(z-1);
            res++;
        }
        return res;
    }
}
