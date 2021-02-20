package leetcode;

import java.util.Stack;

/**
 * 99.13%
 * 34.91%
 */
public class LC0020 {

    public boolean isValid(String s) {
        Stack<Integer> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if(c=='('){
                stack.push(1);
            }else if(c=='['){
                stack.push(2);
            }else if(c=='{'){
                stack.push(3);
            }else if(c==')'){
                if(stack.isEmpty()||stack.peek()!=1){
                    return false;
                }
                stack.pop();
            }else if(c==']'){
                if(stack.isEmpty()||stack.peek()!=2){
                    return false;
                }
                stack.pop();
            }else if(c=='}'){
                if(stack.isEmpty()||stack.peek()!=3){
                    return false;
                }
                stack.pop();
            }
        }
        return stack.isEmpty();
    }

}
