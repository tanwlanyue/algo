package leetcode;

import java.util.Stack;

public class LC0071 {

    public String simplifyPath(String path) {
        Stack<String> stack = new Stack<>();
        String[] split = path.split("/");
        for (int i = 0; i < split.length; i++) {
            String s = split[i];
            if("..".equals(s)){
                if(!stack.isEmpty()){
                    stack.pop();
                }
            }else if (!".".equals(s)&&!"".equals(s)){
                stack.push(s);
            }
        }
        if(stack.isEmpty()){
            return "/";
        }
        String ret="";
        while (!stack.isEmpty()){
            ret="/"+stack.pop()+ret;
        }
        return ret;
    }
}
