package offer;

import util.ListNode;

public class OF18 {
    public ListNode deleteNode(ListNode head, int val) {
        ListNode dummy = new ListNode(-1);
        ListNode newHead = dummy;
        dummy.next=head;
        while (dummy!=null){
            if(dummy.next.val==val){
                dummy.next=dummy.next.next;
                break;
            }
            dummy=dummy.next;
        }
        return newHead.next;
    }
}
