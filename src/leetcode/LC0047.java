package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class LC0047 {

    ArrayList<List<Integer>> ret = new ArrayList<>();
    public List<List<Integer>> permuteUnique(int[] nums) {
        Arrays.sort(nums);
        LinkedList<Integer> path = new LinkedList<>();
        boolean[] used=new boolean[nums.length];
        dfs(nums,path,used,0);
        return ret;
    }

    private void dfs(int[] nums, LinkedList<Integer> path,boolean[] used,int time) {
        if(time==nums.length){
            ret.add(new ArrayList<>(path));
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            if(used[i]){
                continue;
            }
            if(i>0&&nums[i]==nums[i-1]&&!used[i-1]){
                continue;
            }
            used[i]=true;
            path.addLast(nums[i]);
            dfs(nums,path,used,time+1);
            path.removeLast();
            used[i]=false;
        }
    }

    public static void main(String[] args) {
        new LC0047().permuteUnique(new int[]{1,1,2});
    }
}
