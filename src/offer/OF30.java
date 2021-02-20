package offer;

import java.util.LinkedList;

public class OF30 {
}

class MinStack {
    LinkedList<Integer> numStack;
    LinkedList<Integer> minStack;
    /** initialize your data structure here. */
    public MinStack() {
        numStack = new LinkedList<>();
        minStack = new LinkedList<>();
        minStack.push(Integer.MAX_VALUE);
    }

    public void push(int x) {
        numStack.push(x);
        minStack.push(Math.min(x,minStack.peek()));
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