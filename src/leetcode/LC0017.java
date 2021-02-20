package leetcode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * 83.67%
 * 32.72%
 */
public class LC0017 {

    char[][] ch = new char[][]{
            {'a','b','c'},
            {'d','e','f'},
            {'g','h','i'},
            {'j','k','l'},
            {'m','n','o'},
            {'p','q','r','s'},
            {'t','u','v'},
            {'w','x','y','z'}};
    ArrayList<String> ret = new ArrayList<>();

    public List<String> letterCombinations(String digits) {
        if(digits.length()==0){
            return ret;
        }
        dfs(digits,0,new LinkedList<Character>());
        return ret;
    }

    private void dfs(String digits, int index, LinkedList<Character> path) {
        if(digits.length()==index){
            StringBuilder builder = new StringBuilder();
            for (Character character : path) {
                builder.append(character);
            }
            ret.add(builder.toString());
            return;
        }
        int number=digits.charAt(index)-'0';
        char[] chars = this.ch[number - 2];
        for (int i = 0; i < chars.length; i++) {
            path.add(chars[i]);
            dfs(digits,index+1,path);
            path.removeLast();
        }
    }

}
