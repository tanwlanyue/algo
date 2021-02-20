package leetcode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * 96.75%
 * 28.88%
 */
public class LC0046 {
    ArrayList<List<Integer>> ret = new ArrayList<>();

    public List<List<Integer>> permute(int[] nums) {
        boolean[] used = new boolean[nums.length];
        dfs(nums,used,new LinkedList<Integer>());
        return ret;
    }

    private void dfs(int[] nums, boolean[] used, LinkedList<Integer> path) {
        if(path.size()==nums.length){
            ret.add(new ArrayList<>(path));
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            if(used[i]){
                continue;
            }
            path.add(nums[i]);
            used[i]=true;
            dfs(nums, used, path);
            path.removeLast();
            used[i]=false;
        }
    }
}
