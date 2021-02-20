package leetcode;

public class LC0566 {

    public int[][] matrixReshape(int[][] nums, int r, int c) {
        int row = nums.length;
        int column = nums[0].length;
        if(row*column!=r*c){
            return nums;
        }
        int[][] ret = new int[r][c];
        int cnt=0;
        while (cnt<r*c){
            ret[cnt/c][cnt%c]=nums[cnt/column][cnt%column];
            cnt++;
        }
        return ret;
    }
}
