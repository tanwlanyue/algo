package offer;

import java.util.ArrayDeque;

public class OF31 {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        ArrayDeque<Integer> stack = new ArrayDeque<>();
        int i=0,j=0;
        int length = pushed.length;
        while (i<length){
            stack.push(pushed[i++]);
            while (!stack.isEmpty()&&j<length){
                if(stack.peek()==popped[j]){
                    stack.pop();
                    j++;
                }else {
                    break;
                }
            }
        }
        return j==length;
    }
}
