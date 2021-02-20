package leetcode;

import java.util.LinkedList;

/**
 * TODO
 */
public class LC0042 {

    public int trap(int[] height) {
        LinkedList<Integer> stack = new LinkedList<>();
        int area=0;
        for (int i = 0; i < height.length; i++) {
            while (!stack.isEmpty()&&height[i]>height[stack.peek()]){
                Integer baseHeightIndex = stack.pop();
                if(stack.isEmpty()){
                    break;
                }
                int distance=i-stack.peek()-1;
                int h=Math.min(height[stack.peek()],height[i])-height[baseHeightIndex];
                area+=distance*h;
            }
            stack.push(i);
        }
        return area;
    }
//    public int trap(int[] height) {
//        int cnt = 0, rightIndex = 0;
//        ArrayDeque<Integer> stack = new ArrayDeque<>();
//        while (rightIndex < height.length) {
//            while (!stack.isEmpty() && height[rightIndex] > height[stack.peek()]) {
//                int leftIndex = stack.pop();
//                if (stack.isEmpty())
//                    break;
//                int distance = rightIndex - stack.peek() - 1;
//                int bounded_height = Math.min(height[rightIndex], height[stack.peek()]) - height[leftIndex];
//                cnt += distance * bounded_height;
//            }
//            stack.push(rightIndex++);
//        }
//        return cnt;
//    }
}
