package leetcode;

import util.ListNode;

public class LC0148 {
    public ListNode sortList(ListNode head) {
        if(head==null||head.next==null){
            return head;
        }
        ListNode fast=head.next,slow=head;
        while (fast!=null&&fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
        }
        ListNode temp=slow.next;
        slow.next=null;
        ListNode left=sortList(head);
        ListNode right=sortList(temp);
        ListNode dummy=new ListNode(-1);
        ListNode res=dummy;
        while (left!=null &&right!=null){
            if(left.val<right.val){
                dummy.next=left;
                left=left.next;
            }else {
                dummy.next=right;
                right=right.next;
            }
            dummy=dummy.next;
        }
        dummy.next=left==null?right:left;
        return res.next;
    }
}
