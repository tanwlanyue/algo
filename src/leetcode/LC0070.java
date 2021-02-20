package leetcode;

public class LC0070 {

    public int climbStairs(int n) {
        if(n<2){
            return n;
        }
        int a=1;
        int b=2;
        for (int i = 3; i <=n; i++) {
            int sum=a+b;
            a=b;
            b=sum;
        }
        return b;
    }
}
