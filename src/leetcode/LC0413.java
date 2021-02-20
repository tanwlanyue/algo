package leetcode;

public class LC0413 {

    public int numberOfArithmeticSlices(int[] A) {
        int[] dp = new int[A.length];// dp[i]已A[i]结尾的等差数列个数
        for (int i = 2; i < A.length; i++) {
            if(A[i]-A[i-1]==A[i-1]-A[i-2]){
                dp[i]=dp[i-1]+1;
            }
        }
        int sum=0;
        for (int i = 0; i < dp.length; i++) {
            sum+=dp[i];
        }
        return sum;
    }
}
