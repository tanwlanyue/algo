package leetcode;

public class LC0048 {
    // 上下翻转 再水平翻转
    public void rotate(int[][] matrix) {
        int n = matrix.length;
        for (int i = 0; i < n / 2; i++) {
            for (int j = 0; j < n; j++) {
                swap(matrix,i,j,n-i-1,j);
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                swap(matrix,i,j,j,i);
            }
        }
    }

    void swap(int[][] matrix,int a,int b,int c,int d){
        int tmp=matrix[a][b];
        matrix[a][b]=matrix[c][d];
        matrix[c][d]=tmp;
    }

//    public void rotate(int[][] matrix) {
//        int len = matrix.length;
//        for (int i = 0; i < len / 2; i++) {
//            for (int j = i; j < len-i-1; j++) {
//                int tmp=matrix[len-1-j][i];
//                matrix[len-1-j][i]=matrix[len-1-i][len-1-j];
//                matrix[len-1-i][len-1-j]=matrix[j][len-1-i];
//                matrix[j][len-1-i]=matrix[i][j];
//                matrix[i][j]=tmp;
//            }
//        }
//    }
}
