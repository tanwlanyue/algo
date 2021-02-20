package leetcode;

import util.TreeNode;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;

public class LC0637 {

    public List<Double> averageOfLevels(TreeNode root) {
        ArrayList<Double> list = new ArrayList<>();
        if(root==null){
            return list;
        }
        ArrayDeque<TreeNode> queue = new ArrayDeque<>();
        queue.offer(root);
        while (!queue.isEmpty()){
            int size = queue.size();
            double sum=0;
            for (int i = 0; i < size; i++) {
                TreeNode poll = queue.poll();
                sum+=poll.val;
                if(poll.left!=null){
                    queue.offer(poll.left);
                }
                if(poll.right!=null){
                    queue.offer(poll.right);
                }
            }
            list.add(sum/size);
        }
        return list;
    }
}
