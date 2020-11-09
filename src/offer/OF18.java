package offer;

import util.ListNode;

public class OF18 {
    public ListNode deleteNode(ListNode head, int val) {
        ListNode dummy = new ListNode(-1);
        ListNode res = dummy;
        dummy.next=head;
        ListNode pre=dummy;
        dummy=dummy.next;
        while (dummy!=null){
            if(dummy.val==val){
                pre.next=dummy.next;
                dummy=pre.next;
            }else {
                pre=dummy;
                dummy=dummy.next;
            }
        }
        return res.next;
    }
}
