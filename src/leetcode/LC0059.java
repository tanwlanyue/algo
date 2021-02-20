package leetcode;

/**
 * 100.00%
 * 40.03%
 */
public class LC0059 {

    public int[][] generateMatrix(int n) {
        int[][] matrix = new int[n][n];
        int left=0,right=n-1,top=0,bottom=n-1;
        int num=1;
        while (num<=n*n){
            for (int i = left; i <=right; i++) {
                matrix[top][i]=num++;
            }
            top++;
            for (int i = top; i <=bottom ; i++) {
                matrix[i][right]=num++;
            }
            right--;
            for (int i = right; i >=left ; i--) {
                matrix[bottom][i]=num++;
            }
            bottom--;
            for (int i = bottom; i >=top ; i--) {
                matrix[i][left]=num++;
            }
            left++;
        }
        return matrix;
    }
}
