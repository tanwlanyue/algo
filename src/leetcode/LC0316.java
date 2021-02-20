package leetcode;

import java.util.ArrayDeque;

public class LC0316 {

    public String removeDuplicateLetters(String s) {
        ArrayDeque<Character> stack = new ArrayDeque<>();
        if(s.length()<2){
            return s;
        }
        int[] lastIndex = new int[26];
        for (int i = 0; i < s.toCharArray().length; i++) {
            lastIndex[s.charAt(i)-'a']=i;
        }
        boolean[] inStack = new boolean[26];
        for (int i = 0; i < s.toCharArray().length; i++) {
            char c = s.charAt(i);
            if(!inStack[c-'a']){
                while (!stack.isEmpty() &&c-stack.peek()<0 &&lastIndex[stack.peek()-'a']>i){
                    Character pop = stack.pop();
                    inStack[pop-'a']=false;
                }
                stack.push(c);
                inStack[c-'a']=true;
            }

        }
        StringBuilder builder = new StringBuilder();
        while (!stack.isEmpty()){
            builder.append(stack.removeLast());
        }
        return builder.toString();
    }
}
