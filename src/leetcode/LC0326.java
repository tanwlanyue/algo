package leetcode;

/**
 * 29.66%
 * 72.52%
 */
public class LC0326 {

    public boolean isPowerOfThree(int n) {
        if(n<=0){
            return false;
        }
        while (n%3==0){
            n=n/3;
        }
        return n==1;
    }
}
