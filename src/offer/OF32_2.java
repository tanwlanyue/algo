package offer;

import util.TreeNode;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;

public class OF32_2 {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res=new ArrayList<>();
        if(root==null){
            return res;
        }
        ArrayDeque<TreeNode> queue = new ArrayDeque<>();
        queue.offer(root);
        while (!queue.isEmpty()){
            int size = queue.size();
            List<Integer> list = new ArrayList<>();
            res.add(list);
            for (int i = 0; i < size; i++) {
                TreeNode pop = queue.poll();
                list.add(pop.val);
                if(pop.left!=null){
                    queue.offer(pop.left);
                }
                if(pop.right!=null){
                    queue.offer(pop.right);
                }
            }
        }
        return res;
    }
}
