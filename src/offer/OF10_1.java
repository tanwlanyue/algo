package offer;

public class OF10_1 {

    public int fib(int n) {
        if(n<=1){
            return n;
        }
        int a=0;
        int b=1;
        int sum=0;
        for (int i = 2; i <=n; i++) {
            sum=a+b;
            a=b;
            b=sum;
            b=b>1000000007?b%1000000007:b;
        }
        return b;
    }
}
