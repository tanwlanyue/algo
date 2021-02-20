package leetcode;

import java.util.ArrayDeque;

public class LC0739 {

    public int[] dailyTemperatures(int[] T) {
        int[] ret = new int[T.length];
        ArrayDeque<Integer> stack = new ArrayDeque<>();
        for (int i = 0; i < T.length; i++) {
            while (!stack.isEmpty() &&T[i]>T[stack.peek()]){
                Integer index = stack.pop();
                ret[index]=i-index;
            }
            stack.push(i);
        }
        return ret;
    }
}
