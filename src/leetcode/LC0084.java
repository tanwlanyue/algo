package leetcode;

import java.util.ArrayDeque;

public class LC0084 {

    public int largestRectangleArea(int[] heights) {
        int maxArea=0;
        int length = heights.length;
        ArrayDeque<Integer> stack = new ArrayDeque<>();
        for (int i = 0; i < length; i++) {
            while (!stack.isEmpty()&&heights[i]<=heights[stack.peek()]){
                Integer hIndex = stack.pop();
                int left=stack.isEmpty()?0:stack.peek()+1;
                int area=heights[hIndex]*(i-left);
                maxArea=Math.max(area,maxArea);
            }
            stack.push(i);
        }
        while (!stack.isEmpty()){
            Integer hIndex = stack.pop();
            int left=stack.isEmpty()?0:stack.peek()+1;
            int area=heights[hIndex]*(length -left);
            maxArea=Math.max(area,maxArea);
        }
        return maxArea;
    }
}
