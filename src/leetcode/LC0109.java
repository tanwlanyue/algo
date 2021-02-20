package leetcode;

import util.ListNode;
import util.TreeNode;

/**
 * 100.00%
 * 85.36%
 */
public class LC0109 {

    public TreeNode sortedListToBST(ListNode head) {
        if(head==null){
            return null;
        }
        if(head.next==null){
            return new TreeNode(head.val);
        }
        ListNode fast=head.next;
        ListNode slow=head;
        ListNode preMid=slow;
        while (fast!=null&&fast.next!=null){
            preMid = slow;
            fast=fast.next.next;
            slow=slow.next;
        }
        ListNode mid = preMid.next;
        preMid.next=null;
        TreeNode node = new TreeNode(mid.val);
        node.left=sortedListToBST(head);
        node.right=sortedListToBST(mid.next);
        return node;
    }
}
