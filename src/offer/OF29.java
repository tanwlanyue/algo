package offer;

public class OF29 {
    public int[] spiralOrder(int[][] matrix) {
        int row = matrix.length;
        if(row==0){
            return new int[]{};
        }
        int col=matrix[0].length;
        if(col==0){
            return new int[]{};
        }
        int count=row*col;
        int left=0,right=col-1,top=0,bottom=row-1;
        int[] ret = new int[count];
        int index=0;
        while (count>0){
            for (int i = left; i <=right&& count>0; i++) {
                ret[index++]=matrix[top][i];
                count--;
            }
            top++;
            for (int i = top; i <=bottom&& count>0; i++) {
                ret[index++]=matrix[i][right];
                count--;
            }
            right--;
            for (int i = right; i >=left&& count>0; i--) {
                ret[index++]=matrix[bottom][i];
                count--;
            }
            bottom--;
            for (int i = bottom; i >=top&& count>0; i--) {
                ret[index++]=matrix[i][left];
                count--;
            }
            left++;
        }
        return ret;
    }
}
