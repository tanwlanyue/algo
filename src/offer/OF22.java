package offer;

import util.ListNode;

public class OF22 {
    public ListNode getKthFromEnd(ListNode head, int k) {
        ListNode cN=head;
        int cnt=0;
        while (cN!=null){
            cnt++;
            cN=cN.next;
        }
        ListNode dummy = new ListNode(-1);
        dummy.next=head;
        for (int i = 0; i < k; i++) {
            head=head.next;
        }
        while (head!=null){
            head=head.next;
            dummy=dummy.next;
        }
        return dummy.next;
    }
}
