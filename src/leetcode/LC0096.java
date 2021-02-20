package leetcode;

public class LC0096 {

    public int numTrees(int n) {
        int[] tb = new int[n + 1];
        tb[0]=1;
        tb[1]=1;
        for (int i = 2; i <=n; i++) {
            for (int j = 0; j < i; j++) {
                tb[i]+=tb[j]*tb[i-j-1];
            }
        }
        return tb[n];
    }
}
