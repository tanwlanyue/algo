package leetcode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * 82.17%
 * 5.30%
 */
public class LC0078 {

    ArrayList<List<Integer>> ret = new ArrayList<>();

    public List<List<Integer>> subsets(int[] nums) {
        dfs(nums,new LinkedList<Integer>(),0);
        return ret;
    }

    private void dfs(int[] nums, LinkedList<Integer> path, int i) {
        if(i==nums.length){
            ret.add(new ArrayList<>(path));
            return;
        }
        dfs(nums,path,i+1);
        path.add(nums[i]);
        dfs(nums,path,i+1);
        path.removeLast();
    }
}
