package leetcode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LC0077 {

    List<List<Integer>> res = new ArrayList<>();

    public List<List<Integer>> combine(int n, int k) {
        if (k <= 0 || n < k) {
            return res;
        }
        LinkedList<Integer> path = new LinkedList<>();

        backTrack(n, k, 1, path);
        return res;
    }

    void backTrack(int n, int k, int begin, LinkedList<Integer> path) {
        if (path.size() == k) {
            res.add(new ArrayList<>(path));
            return;
        }

        if(n-begin+1+path.size()<k){
            return;
        }

        for (int i = begin; i <= n; i++) {
            path.add(i);
            backTrack(n, k, i + 1, path);
            path.removeLast();
        }
    }
}
