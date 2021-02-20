package leetcode;

/**
 * 99.66%
 * 72.24%
 */
public class LC0766 {

    public boolean isToeplitzMatrix(int[][] matrix) {
        int row = matrix.length;
        int column = matrix[0].length;
        for (int i = 0; i < row; i++) {
            int num=matrix[i][0];
            int r=i+1,c=1;
            while (r<row&&c<column){
                if(num!=matrix[r][c]){
                    return false;
                }
                r++;
                c++;
            }
        }

        for (int j = 0; j < column; j++) {
            int num=matrix[0][j];
            int r=1,c=j+1;
            while (r<row&&c<column){
                if(num!=matrix[r][c]){
                    return false;
                }
                r++;
                c++;
            }
        }
        return true;
    }
}
