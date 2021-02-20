package leetcode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LC0039 {
    ArrayList<List<Integer>> ret = new ArrayList<>();
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        dfs(candidates,target,0,new LinkedList<Integer>(),0);
        return ret;
    }

    private void dfs(int[] candidates, int target, int sum,LinkedList<Integer> path, int start) {
        if(sum>=target){
            if(sum==target){
                ret.add(new ArrayList<>(path));
            }
            return;
        }

        for (int i = start; i < candidates.length; i++) {
            path.add(candidates[i]);
            dfs(candidates,target,sum+candidates[i],path,i);
            path.removeLast();
        }

    }
}
