package leetcode;

public class LC0240 {

    public boolean searchMatrix(int[][] matrix, int target) {
        int row = matrix.length;
        int column=matrix[0].length;
        int i=0,j=column-1;
        while (i<row&&j>=0){
            int cur = matrix[i][j];
            if(cur>target){
                j--;
            }else if(cur<target){
                i++;
            }else {
                return true;
            }
        }
        return false;
    }
}
