package offer;

import java.util.LinkedList;

public class OF31 {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        LinkedList<Integer> stack = new LinkedList<>();
        int i=0,j=0;
        while (i<pushed.length&&i<popped.length){
            stack.push(pushed[i++]);
            while (!stack.isEmpty()&&popped[j]==stack.peek()) {
                stack.pop();
                j++;
            }
        }
        return stack.isEmpty();
    }
}
