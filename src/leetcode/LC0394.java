package leetcode;

import java.util.ArrayDeque;

/**
 * TODO
 */
public class LC0394 {

    public String decodeString(String s) {
        StringBuilder ret = new StringBuilder();
        ArrayDeque<Integer> numStack = new ArrayDeque<>();
        ArrayDeque<String> stringStack = new ArrayDeque<>();
        int num = 0;
        for(Character c : s.toCharArray()) {
            if(c == '[') {
                numStack.push(num);
                stringStack.push(ret.toString());
                num = 0;
                ret = new StringBuilder();
            }
            else if(c == ']') {
                StringBuilder tmp = new StringBuilder();
                int cur_multi = numStack.pop();
                for(int i = 0; i < cur_multi; i++){
                    tmp.append(ret);
                }
                ret = new StringBuilder(stringStack.pop() + tmp);
            }
            else if(Character.isDigit(c)) {//如果是数字
                num = num * 10 + Integer.parseInt(c + "");
            }
            else {// 如果是字母
                ret.append(c);
            }
        }
        return ret.toString();
    }
}
