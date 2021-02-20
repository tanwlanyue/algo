package leetcode;

import util.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * 100.00%
 * 54.20%
 */
public class LC0094 {

    public List<Integer> inorderTraversal(TreeNode root) {
        ArrayList<Integer> ret = new ArrayList<>();
        LinkedList<TreeNode> stack = new LinkedList<>();
        while (root!=null|| !stack.isEmpty()){
            while (root!=null){
                stack.push(root);
                root=root.left;
            }
            TreeNode pop = stack.pop();
            ret.add(pop.val);
            root=pop.right;
        }
        return ret;
    }
}
