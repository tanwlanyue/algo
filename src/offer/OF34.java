package offer;

import util.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * 100.00%
 * 92.72%
 */
public class OF34 {
    ArrayList<List<Integer>> lists = new ArrayList<>();

    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        if(root==null){
            return lists;
        }
        dfs(root,sum,new LinkedList<Integer>());
        return lists;
    }

    private void dfs(TreeNode root, int sum, LinkedList<Integer> path) {
        if(root==null){
            return;
        }
        path.add(root.val);
        sum=sum-root.val;
        if(root.left==null&&root.right==null){
            if(sum==0){
                lists.add(new ArrayList<>(path));
            }
            // 此处不能return
        }
        dfs(root.left,sum,path);
        dfs(root.right,sum,path);
        path.removeLast();
    }
}
