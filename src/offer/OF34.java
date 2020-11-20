package offer;

import util.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class OF34 {

    ArrayList<List<Integer>> res = new ArrayList<>();

    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        if(root==null){
            return res;
        }
        LinkedList<Integer> path = new LinkedList<>();
        dfs(root,path,sum);
        return res;
    }

    private void dfs(TreeNode node, LinkedList<Integer> path,int sum) {
        if(node==null){
            return;
        }
        path.add(node.val);
        sum-=node.val;
        if(sum ==0&& node.left==null && node.right==null){
            res.add(new ArrayList<>(path));// 引用问题
            return;
        }else {
            dfs(node.left,path,sum);
            dfs(node.right,path,sum);
        }
        path.removeLast();
    }
}
