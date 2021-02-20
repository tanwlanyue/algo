package offer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

public class OF38 {
    // 全排列 去重怎么搞 怎么剪枝
    ArrayList<String> list = new ArrayList<>();
    public String[] permutation(String s) {
        char[] array = s.toCharArray();
        Arrays.sort(array);
        dfs(array,new LinkedList<Character>(),0);
        String[] ret = new String[list.size()];
        for (int i = 0; i < ret.length; i++) {
            ret[i]=list.get(i);
        }
        return ret;
    }

    private void dfs(char[] array, LinkedList<Character> path, int index) {
        for (int i1 = 0; i1 < array.length; i1++) {



        }
    }
}
