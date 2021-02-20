package leetcode;

import java.util.LinkedList;

/**
 * 77.13%
 * 80.80%
 */
public class LC0155 {
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
        minStack.push(Math.min(minStack.peek(),x));
    }

    public void pop() {
        numStack.pop();
        minStack.pop();
    }

    public int top() {
        return numStack.peek();
    }

    public int getMin() {
        return minStack.peek();
    }
}