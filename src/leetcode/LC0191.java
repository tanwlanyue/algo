package leetcode;

/**
 * 95.60%
 * 92.54%
 */
public class LC0191 {

    public int hammingWeight(int n) {
        int cnt=0;
        while (n!=0){
            n=n&(n-1);
            cnt++;
        }
        return cnt;
    }
}
