package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

public class LC0150 {

    public int evalRPN(String[] tokens) {
        ArrayList<String> op = new ArrayList<>(Arrays.asList("+", "-", "*", "/"));
        LinkedList<Integer> numStack = new LinkedList<>();
        for (int i = 0; i < tokens.length; i++) {
            if (op.contains(tokens[i])) {
                Integer second = numStack.pop();
                Integer first = numStack.pop();
                if("+".equals(tokens[i])){
                    numStack.push(first+second);
                }else if("-".equals(tokens[i])){
                    numStack.push(first-second);
                }else if("*".equals(tokens[i])){
                    numStack.push(first*second);
                }else if("/".equals(tokens[i])){
                    numStack.push(first/second);
                }
            }else {
                numStack.push(Integer.valueOf(tokens[i]));
            }
        }
        return numStack.pop();
    }
}
