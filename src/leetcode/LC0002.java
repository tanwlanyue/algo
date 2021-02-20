package leetcode;

import util.ListNode;

/**
 * 99.81%
 * 88.24%
 */
public class LC0002 {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head=new ListNode(-1);
        ListNode dummy=head;
        int plus=0;
        while (l1!=null&&l2!=null){
            int sum=l1.val+l2.val+plus;
            ListNode listNode = new ListNode(sum % 10);
            dummy.next=listNode;
            dummy=dummy.next;
            l1=l1.next;
            l2=l2.next;
            plus=sum>=10?1:0;
        }
        while (l1!=null){
            int sum=l1.val+plus;
            ListNode listNode = new ListNode(sum % 10);
            dummy.next=listNode;
            dummy=dummy.next;
            l1=l1.next;
            plus=sum>=10?1:0;
        }
        while (l2!=null){
            int sum=l2.val+plus;
            ListNode listNode = new ListNode(sum % 10);
            dummy.next=listNode;
            dummy=dummy.next;
            l2=l2.next;
            plus=sum>=10?1:0;
        }
        if(plus==1){
            ListNode listNode = new ListNode(1);
            dummy.next=listNode;
        }
        return head.next;
    }
}
