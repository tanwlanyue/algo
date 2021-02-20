package leetcode;

import java.util.ArrayList;
import java.util.List;

public class LC0054 {

    public List<Integer> spiralOrder(int[][] matrix) {
        ArrayList<Integer> list = new ArrayList<>();
        int row = matrix.length;
        int col = matrix[0].length;
        int left = 0, right = col - 1, top = 0, bottom = row - 1;
        int rel = row * col;
        while (rel >= 1) {
            for (int i = left; i <= right && rel >= 1; i++) {
                list.add(matrix[top][i]);
                rel--;
            }
            top++;
            for (int i = top; i <= bottom && rel >= 1; i++) {
                list.add(matrix[i][right]);
                rel--;
            }
            right--;
            for (int i = right; i >= left && rel >= 1; i--) {
                list.add(matrix[bottom][i]);
                rel--;
            }
            bottom--;
            for (int i = bottom; i >= top && rel >= 1; i--) {
                list.add(matrix[i][left]);
                rel--;
            }
            left++;
        }
        return list;
    }
}
