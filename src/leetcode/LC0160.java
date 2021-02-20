package leetcode;

import util.ListNode;

public class LC0160 {

//    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
//        int lenA = getLen(headA);
//        int lenB = getLen(headB);
//        if(lenA>lenB){
//            for (int i = 0; i < lenA - lenB; i++) {
//                headA=headA.next;
//            }
//        }else {
//            for (int i = 0; i < lenB - lenA; i++) {
//                headB=headB.next;
//            }
//        }
//        while (headA!=null&&headB!=null){
//            if(headA==headB){
//                return headA;
//            }else {
//                headA=headA.next;
//                headB=headB.next;
//            }
//        }
//        return null;
//    }
//
//    private int getLen(ListNode head) {
//        int count=0;
//        while (head!=null){
//            head=head.next;
//            count++;
//        }
//        return count;
//    }

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode ha=headA,hb=headB;
        while (ha!=hb){
            ha=(ha!=null)?ha.next:headB;
            hb=(hb!=null)?hb.next:headA;
        }
        return ha;
    }


}
