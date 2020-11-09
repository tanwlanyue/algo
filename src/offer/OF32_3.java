package offer;

import util.TreeNode;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OF32_3 {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res=new ArrayList<>();
        if(root==null){
            return res;
        }
        ArrayDeque<TreeNode> queue = new ArrayDeque<>();
        queue.offer(root);
        int level=0;
        while (!queue.isEmpty()){
            int size = queue.size();
            List<Integer> list = new ArrayList<>();
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
            level++;
            if(level%2==0){
                Collections.reverse(list);
            }
            res.add(list);
        }
        return res;
    }
}
