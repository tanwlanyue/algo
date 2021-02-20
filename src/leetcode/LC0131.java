package leetcode;

import java.util.*;

/**
 * 38.94%
 * 22.40%
 */
public class LC0131 {

    public List<List<String>> partition(String s) {
        ArrayList<List<String>> ret = new ArrayList<>();
        int length=s.length();
        if(length==0){
            return ret;
        }
        char[] array = s.toCharArray();
        backTrace(array,0,ret,new ArrayList<>());
        return ret;
    }

    private void backTrace(char[] array, int start, List<List<String>> ret, List<String> path) {
        int length = array.length;
        if(start==length){
            ret.add(new ArrayList<>(path));
        }
        for (int end = start; end <length ; end++) {
            if(!isMatch(array,start,end)){
                continue;
            }
            path.add(new String(array, start, end - start + 1));
            backTrace(array,end+1,ret,path);
            path.remove(path.size()-1);
        }
    }

    public boolean isMatch(char[] array, int start, int end) {
        if(start == end) {
            return true;
        }
        while (start<end){
            if(array[start++] != array[end--]){
                return false;
            }
        }
        return true;
    }
}
