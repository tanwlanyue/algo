package offer;

import java.util.LinkedList;

public class OF09 {


}
class CQueue {

    LinkedList<Integer> stack1;
    LinkedList<Integer> stack2;
    public CQueue() {
        stack1 = new LinkedList<>();
        stack2 = new LinkedList<>();
    }

    public void appendTail(int value) {
        stack1.push(value);
    }

    public int deleteHead() {
        if(!stack2.isEmpty()){
            return stack2.pop();
        }
        while (!stack1.isEmpty()){
            stack2.push(stack1.pop());
        }
        return stack2.isEmpty()?-1:stack2.pop();
    }
}