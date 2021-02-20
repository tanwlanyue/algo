package leetcode;

import util.ListNode;

/**
 * 98.37%
 * 64.44%
 */
public class LC0148 {
    // 快慢指针 中间截断 归并
    public ListNode sortList(ListNode head) {
        if(head==null||head.next==null){
            return head;
        }
        ListNode fast=head.next;
        ListNode slow=head;
        while (fast!=null&&fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
        }
        ListNode next = slow.next;
        slow.next=null;
        ListNode listOne=sortList(head);;
        ListNode listTwo = sortList(next);
        return mergeNode(listOne,listTwo);
    }

    private ListNode mergeNode(ListNode listOne, ListNode listTwo) {
        ListNode head = new ListNode(-1);
        ListNode dummy=head;
        while (listOne!=null&&listTwo!=null){
            if(listOne.val<listTwo.val){
                dummy.next=listOne;
                dummy=listOne;
                listOne=listOne.next;
            }else {
                dummy.next=listTwo;
                dummy=listTwo;
                listTwo=listTwo.next;
            }
        }
        if(listOne!=null){
            dummy.next=listOne;
        }
        if(listTwo!=null){
            dummy.next=listTwo;
        }
        return head.next;
    }
//    public ListNode sortList(ListNode head) {
//        if(head==null||head.next==null){
//            return head;
//        }
//        ListNode fast=head.next;
//        ListNode slow=head;
//        while (fast!=null&&fast.next!=null){
//            fast=fast.next.next;
//            slow=slow.next;
//        }
//        ListNode head2 = slow.next;
//        slow.next=null;
//        ListNode h1 = sortList(head);
//        ListNode h2 = sortList(head2);
//        ListNode dummy=new ListNode(-1);
//        ListNode res=dummy;
//        while (h1!=null&&h2!=null){
//            if(h1.val<=h2.val){
//                dummy.next=h1;
//                h1=h1.next;
//            }else {
//                dummy.next=h2;
//                h2=h2.next;
//            }
//            dummy=dummy.next;
//        }
//        if (h1!=null){
//            dummy.next=h1;
//        }
//        if (h2!=null){
//            dummy.next=h2;
//        }
//        return res.next;
//    }

}
