package leetcode;

import util.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * 99.86%
 * 49.05%
 */
public class LC0095 {

    public List<TreeNode> generateTrees(int n) {
        if(n<1){
            return new ArrayList<>();
        }
        return generateTrees(1,n);
    }

    private List<TreeNode> generateTrees(int left, int right) {
        ArrayList<TreeNode> treeNodes = new ArrayList<>();
        if (left > right) {
            treeNodes.add(null);
            return treeNodes;
        }
        for (int i = left; i <= right; i++) {
            List<TreeNode> lList = generateTrees(left, i - 1);
            List<TreeNode> rList = generateTrees(i + 1, right);
            for (TreeNode lNode : lList) {
                for (TreeNode rNode : rList) {
                    TreeNode node = new TreeNode(i);
                    node.left=lNode;
                    node.right=rNode;
                    treeNodes.add(node);
                }
            }
        }
        return treeNodes;
    }
}
