package offer;

import java.util.ArrayDeque;

public class OF30 {

    class MinStack {
        ArrayDeque<Integer> numStack;
        ArrayDeque<Integer> minStack;
        /** initialize your data structure here. */
        public MinStack() {
            this.numStack = new ArrayDeque<>();
            this.minStack = new ArrayDeque<>();
        }

        public void push(int x) {
            numStack.push(x);
            if(minStack.isEmpty()){
                minStack.push(x);
            }else {
                Integer peek = minStack.peek();
                minStack.push(peek>x?x:peek);
            }
        }

        public void pop() {
            numStack.pop();
            minStack.pop();
        }

        public int top() {
            return numStack.peek();
        }

        public int min() {
            return minStack.peek();
        }
    }
}
