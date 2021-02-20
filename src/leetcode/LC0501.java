package leetcode;

import util.TreeNode;

import java.util.ArrayList;

/**
 * 65.48%
 * 87.07%
 */
public class LC0501 {


    TreeNode preNode=null;
    int maxCount=0;
    int count=1;
    public int[] findMode(TreeNode root) {
        ArrayList<Integer> list = new ArrayList<>();
        inOrder(root,list);
        int size = list.size();
        int[] ret = new int[size];
        for (int i = 0; i < list.size(); i++) {
            ret[i]=list.get(i);
        }
        return ret;
    }

    private void inOrder(TreeNode root, ArrayList<Integer> list) {
        if(root==null){
            return;
        }
        inOrder(root.left,list);
        if(preNode!=null){
            if (root.val==preNode.val) {
                count++;
            }else {
                count=1;
            }
        }
        if(count>maxCount){
            maxCount=count;
            list.clear();
            list.add(root.val);
        }else if(count==maxCount){
            list.add(root.val);
        }
        preNode=root;
        inOrder(root.right,list);
    }
}
