package leetcode;

/**
 * 两种情况 一种是第一行第一列本来就是1
 * 一种是被其他影响置为1的情况
 */
public class LC0073 {

    public void setZeroes(int[][] matrix) {
        boolean row0Flag=false;
        boolean col0Flag=false;
        int row=matrix.length;
        int col=matrix[0].length;
        for (int i = 0; i < row; i++) {
            if(matrix[i][0]==0){
                col0Flag=true;
            }
        }
        for (int j = 0; j < col; j++) {
            if(matrix[0][j]==0){
                row0Flag=true;
            }
        }

        for (int i = 1; i < row; i++) {
            for (int j = 1; j < col; j++) {
                if(matrix[i][j]==0){
                    matrix[i][0]=0;
                    matrix[0][j]=0;
                }
            }
        }

        for (int i = 1; i < row; i++) {
            for (int j = 1; j < col; j++) {
                if (matrix[i][0] == 0 || matrix[0][j] == 0) {
                    matrix[i][j] = 0;
                }
            }
        }

        if(col0Flag){
            for (int i = 0; i < row; i++) {
                matrix[i][0] = 0;
            }
        }
        if(row0Flag){
            for (int j = 0; j < col; j++) {
                matrix[0][j] = 0;
            }
        }
    }
}
