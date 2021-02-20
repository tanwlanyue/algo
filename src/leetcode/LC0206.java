package leetcode;

import util.ListNode;

/**
 * 100.00%
 * 81.85%
 */
public class LC0206 {

    public ListNode reverseList(ListNode head) {
        ListNode ret=null;
        while (head!=null){
            ListNode next = head.next;
            head.next=ret;
            ret=head;
            head=next;
        }
        return ret;
    }
}
