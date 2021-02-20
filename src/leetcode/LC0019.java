package leetcode;

import util.ListNode;

/**
 * 100.00%
 * 67.67%
 */
public class LC0019 {

    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(-1);
        dummy.next=head;
        ListNode fast=dummy;
        ListNode slow=dummy;
        for (int i = 0; i < n; i++) {
            fast=fast.next;
        }
        while (fast.next!=null){
            fast=fast.next;
            slow=slow.next;
        }
        slow.next=slow.next.next;
        return dummy.next;
    }
}
