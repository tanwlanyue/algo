package offer;

public class OF13 {

    boolean[][] digitTable;
    boolean[][] hasVisit;
    int cnt=0;
    public int movingCount(int m, int n, int k) {
        initDigitSum(m,n,k);
        hasVisit=new boolean[m][n];
        backTrace(0,0,m,n);
        return cnt;
    }

    private void backTrace(int i, int j, int m, int n) {
        if(i<0||i>=m||j<0||j>=n|| digitTable[i][j]||hasVisit[i][j]){
            return;
        }
        hasVisit[i][j]=true;
        cnt++;
        backTrace(i+1,j,m,n);
        backTrace(i-1,j,m,n);
        backTrace(i,j+1,m,n);
        backTrace(i,j-1,m,n);
    }


    private void initDigitSum(int m,int n,int k) {
        int[] digitSum = new int[Math.max(m, n)];
        for (int i = 0; i < digitSum.length; i++) {
            int a = i;
            while (a > 0) {
                digitSum[i] += a % 10;
                a /= 10;
            }
        }
        this.digitTable = new boolean[m][n];
        for (int i = 0; i < m; i++){
            for (int j = 0; j < n; j++){
                this.digitTable[i][j] = digitSum[i] + digitSum[j]>k;
            }
        }
    }
}
