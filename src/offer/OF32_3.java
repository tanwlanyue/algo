package offer;

import util.TreeNode;

import java.util.*;

/**
 * 99.76%
 * 42.05%
 */
public class OF32_3 {
    public List<List<Integer>> levelOrder(TreeNode root) {
        ArrayList<List<Integer>> ret = new ArrayList<>();
        if(root==null){
            return ret;
        }
        LinkedList<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        int line=0;
        while (!queue.isEmpty()){
            int size=queue.size();
            LinkedList<Integer> list = new LinkedList<>();
            for (int i = 0; i < size; i++) {
                TreeNode node = queue.poll();
                if(line%2==0){
                    list.add(node.val);
                }else {
                    list.addFirst(node.val);
                }
                if(node.left!=null){
                    queue.offer(node.left);
                }
                if(node.right!=null){
                    queue.offer(node.right);
                }
            }
            ret.add(list);
            line++;
        }
        return ret;
    }
}
