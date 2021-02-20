package leetcode;

import java.util.ArrayDeque;

public class LC0088 {

    public int maximalRectangle(char[][] matrix) {
        if(matrix.length==0||matrix[0].length==0){
            return 0;
        }
        int res=0;
        int[] height = new int[matrix[0].length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j <matrix[0].length; j++) {
                height[j]=matrix[i][j]=='0'?0:height[j]+1;
            }
            res=Math.max(maximalRectangle(height),res);
        }
        return res;
    }

    private int maximalRectangle(int[] table) {
        int max=0;
        ArrayDeque<Integer> stack = new ArrayDeque<>();
        for (int i = 0; i < table.length; i++) {
            while (!stack.isEmpty()&&table[i]<=table[stack.peek()]){
                Integer index = stack.pop();
                int right=i;
                int left=stack.isEmpty()?-1:stack.peek();
                int area=table[index]*(right-left-1);
                max=Math.max(area,max);
            }
            stack.push(i);
        }
        while (!stack.isEmpty()){
            Integer index = stack.pop();
            int left=stack.isEmpty()?-1:stack.peek();
            int right=table.length;
            int area=table[index]*(right-left-1);
            max=Math.max(area,max);
        }
        return max;
    }

}
