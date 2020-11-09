package leetcode;

import util.TreeNode;

public class LC0437 {
    public int pathSum(TreeNode root, int sum) {
        if(root==null){
            return 0;
        }
        return pathStartRoot(root,sum)+pathSum(root.left,sum)+pathSum(root.right,sum);
    }

    private int pathStartRoot(TreeNode root, int sum) {
        if(root==null){
            return 0;
        }
        int ret=root.val==sum?1:0;
        ret+=pathStartRoot(root.left,sum-root.val)+pathStartRoot(root.right,sum-root.val);
        return ret;
    }
}
