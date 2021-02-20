package offer;

import util.TreeNode;

import java.util.*;

/**
 * 99.76%
 * 95.88%
 */
public class OF32_1 {
    public int[] levelOrder(TreeNode root) {
        if(root==null){
            return new int[]{};
        }
        LinkedList<TreeNode> queue = new LinkedList<>();
        ArrayList<Integer> list = new ArrayList<>();
        queue.offer(root);
        while (!queue.isEmpty()){
            TreeNode node = queue.poll();
            list.add(node.val);
            if(node.left!=null){
                queue.offer(node.left);
            }
            if(node.right!=null){
                queue.offer(node.right);
            }
        }
        int[] ints = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            ints[i]=list.get(i);
        }
        return ints;
    }
}
