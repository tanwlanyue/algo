package leetcode;

import java.util.ArrayDeque;

/**
 * TODO
 */
public class LC0042 {
    public int trap(int[] height) {
        int cnt = 0, rightIndex = 0;
        ArrayDeque<Integer> stack = new ArrayDeque<>();
        while (rightIndex < height.length) {
            while (!stack.isEmpty() && height[rightIndex] > height[stack.peek()]) {
                int leftIndex = stack.pop();
                if (stack.isEmpty())
                    break;
                int distance = rightIndex - stack.peek() - 1;
                int bounded_height = Math.min(height[rightIndex], height[stack.peek()]) - height[leftIndex];
                cnt += distance * bounded_height;
            }
            stack.push(rightIndex++);
        }
        return cnt;
    }
}
