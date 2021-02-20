package offer;

import util.ListNode;

public class OF22 {
    public ListNode getKthFromEnd(ListNode head, int k) {
        ListNode dummy=head;
        for (int i = 0; i < k; i++) {
            dummy=dummy.next;
        }
        while (dummy!=null){
            dummy=dummy.next;
            head=head.next;
        }
        return head;
    }
}
