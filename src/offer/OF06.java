package offer;

import util.ListNode;

public class OF06 {

    public int[] reversePrint(ListNode head) {
        ListNode dummy=head;
        int len=0;
        while (dummy!=null){
            dummy=dummy.next;
            len++;
        }
        int[] ret = new int[len];
        int i=len-1;
        while (head!=null){
            ret[i--]=head.val;
            head=head.next;
        }
        return ret;
    }
}
