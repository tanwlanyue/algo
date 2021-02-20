package leetcode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LC0022 {

    ArrayList<String> ret = new ArrayList<>();

    public List<String> generateParenthesis(int n) {
        LinkedList<Character> path = new LinkedList<>();
        dfs(path,n,0,0);
        return ret;
    }

    private void dfs(LinkedList<Character> path,int n,int leftCount,int rightCount) {
        if(leftCount<rightCount){
            return;
        }
        if(path.size()==2*n){
            if(leftCount!=rightCount){
                return;
            }
            StringBuilder builder = new StringBuilder();
            for (Character character : path) {
                builder.append(character);
            }
            ret.add(builder.toString());
            return;
        }
        path.add('(');
        dfs(path,n,leftCount+1,rightCount);
        path.removeLast();
        path.add(')');
        dfs(path,n,leftCount,rightCount+1);
        path.removeLast();
    }
}
