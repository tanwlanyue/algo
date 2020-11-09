package offer;

import util.TreeNode;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;

public class OF32_1 {
    public int[] levelOrder(TreeNode root) {
        if(root==null){
            return new int[]{};
        }
        ArrayDeque<TreeNode> queue = new ArrayDeque<>();
        queue.offer(root);
        List<Integer> list = new ArrayList<>();
        while (!queue.isEmpty()){
            int size = queue.size();
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
        int size = list.size();
        int[] res = new int[size];
        for (int i = 0; i < size; i++) {
            res[i]=list.get(i);
        }
        return res;
    }
}
