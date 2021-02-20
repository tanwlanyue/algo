package offer;

import util.TreeNode;

import java.util.LinkedList;

public class OF54 {

    public int kthLargest(TreeNode root, int k) {
        LinkedList<TreeNode> stack = new LinkedList<>();
        stack.push(root);
        while (!stack.isEmpty()||root!=null){
            while (root!=null){
                stack.push(root);
                root=root.right;
            }
            root = stack.poll();
            if(--k==0){
                return root.val;
            }
            root=root.left;
        }
        return root.val;
    }
}
