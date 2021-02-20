package offer;

public class OF10_2 {

    public int numWays(int n) {
        if(n<=1){
            return 1;
        }
        int a=1;
        int b=1;
        int sum=0;
        for (int i = 2; i <=n; i++) {
            sum=a+b;
            a=b;
            b=sum%1000000007;
        }
        return b;
    }

}
