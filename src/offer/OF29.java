package offer;

public class OF29 {
    public int[] spiralOrder(int[][] matrix) {
        if(matrix.length==0||matrix[0].length==0){
            return new int[]{};
        }
        int[] res = new int[matrix.length * matrix[0].length];
        int n=0;
        int r1=0,r2=matrix.length-1,c1=0,c2=matrix[0].length-1;
        while (r1 <= r2 && c1 <= c2) {
            for (int i = c1; i <=c2; i++) {
                res[n++]=matrix[r1][i];
            }
            for (int i = r1+1; i <=r2; i++) {
                res[n++]=matrix[i][c2];
            }
            if(r1!=r2){
                for (int i = c2-1; i >=c1; i--) {
                    res[n++]=matrix[r2][i];
                }
            }
            if(c1!=c2){
                for (int i = r2-1; i >=r1+1; i--) {
                    res[n++]=matrix[i][c1];
                }
            }
            r1++;r2--;c1++;c2--;
        }
        return res;
    }
}
