package offer;

public class OF13 {

//    boolean[][] digitTable;
//    boolean[][] hasVisit;
//    int cnt=0;
//    public int movingCount(int m, int n, int k) {
//        initDigitSum(m,n,k);
//        hasVisit=new boolean[m][n];
//        backTrace(0,0,m,n);
//        return cnt;
//    }
//
//    private void backTrace(int i, int j, int m, int n) {
//        if(i<0||i>=m||j<0||j>=n|| digitTable[i][j]||hasVisit[i][j]){
//            return;
//        }
//        hasVisit[i][j]=true;
//        cnt++;
//        backTrace(i+1,j,m,n);
//        backTrace(i-1,j,m,n);
//        backTrace(i,j+1,m,n);
//        backTrace(i,j-1,m,n);
//    }
//
//
//    private void initDigitSum(int m,int n,int k) {
//        int[] digitSum = new int[Math.max(m, n)];
//        for (int i = 0; i < digitSum.length; i++) {
//            int a = i;
//            while (a > 0) {
//                digitSum[i] += a % 10;
//                a /= 10;
//            }
//        }
//        this.digitTable = new boolean[m][n];
//        for (int i = 0; i < m; i++){
//            for (int j = 0; j < n; j++){
//                this.digitTable[i][j] = digitSum[i] + digitSum[j]>k;
//            }
//        }
//    }

    public int movingCount(int m, int n, int k) {
        boolean[][] visited = new boolean[m][n];
        dfs(visited,m,n,k,0,0);
        int count=0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (visited[i][j]){
                    count++;
                }
            }
        }
        return count;
    }

    private void dfs(boolean[][] visited, int m, int n, int k, int i, int j) {
        if(i<0||i>=m||j<0||j>=n||visited[i][j]||!canAccess(i, j, k)){
            return;
        }
        int[][] ops = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};
        visited[i][j]=true;
        for (int[] op : ops) {
            dfs(visited,m,n,k,i+op[0],j+op[1]);
        }
    }

    boolean canAccess(int i,int j,int k){
        int sum=0;
        while (i!=0){
            sum+=i%10;
            i=i/10;
        }
        while (j!=0){
            sum+=j%10;
            j=j/10;
        }
        return sum<=k;
    }
}
