package leetcode;

import util.TreeNode;

import java.util.LinkedList;

/**
 * 100.00%
 * 98.33%
 */
public class LC0230 {

    public int kthSmallest(TreeNode root, int k) {
        LinkedList<TreeNode> stack = new LinkedList<>();
        while (!stack.isEmpty()||root!=null){
            while (root!=null){
                stack.push(root);
                root=root.left;
            }
            root=stack.pop();
            if(--k==0){
                return root.val;
            }
            root=root.right;
        }
        return root.val;
    }
}
