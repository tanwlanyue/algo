package leetcode;

import util.ListNode;

/**
 * 100.00%
 * 43.86%
 */
public class LC0061 {

    public ListNode rotateRight(ListNode head, int k) {
        if(head==null||k==0){
            return null;
        }
        int len=0;
        ListNode dummy=head;
        while (dummy!=null){
            dummy=dummy.next;
            len++;
        }
        k=k%len;
        if(k==0){
            return head;
        }
        //找到第len-k个node
        int count=0;
        dummy=head;
        for (int i = 0; i < len-k-1; i++) {
            dummy=dummy.next;
        }
        ListNode newHead = dummy.next;
        dummy.next=null;
        dummy=newHead;
        while (dummy.next!=null){
            dummy=dummy.next;
        }
        dummy.next=head;
        return newHead;
    }
}
