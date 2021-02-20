package leetcode;

import util.ListNode;

public class LC0023 {

    public ListNode mergeKLists(ListNode[] lists) {
        int length = lists.length;
        if(length==0){
            return null;
        }else if(length==1){
            return lists[0];
        }else if(length==2){
            return mergeList(lists[0],lists[1]);
        }
        int mid=length/2;
        ListNode[] listOne = new ListNode[mid];
        ListNode[] listTwo = new ListNode[length - mid];
        for (int i = 0; i < mid; i++) {
            listOne[i]=lists[i];
        }
        for (int i = mid,j=0; i < length; i++,j++) {
            listTwo[j]=lists[i];
        }
        ListNode node1 = mergeKLists(listOne);
        ListNode node2 = mergeKLists(listTwo);
        return mergeList(node1,node2);
    }

    ListNode mergeList(ListNode node1,ListNode node2){
        ListNode node = new ListNode(-1);
        ListNode dummy=node;
        while (node1!=null&&node2!=null){
            if(node1.val<node2.val){
                dummy.next=node1;
                dummy=dummy.next;
                node1=node1.next;
            }else {
                dummy.next=node2;
                dummy=dummy.next;
                node2=node2.next;
            }
        }
        if (node1!=null){
            dummy.next=node1;
        }
        if (node2!=null){
            dummy.next=node2;
        }
        return node.next;
    }
}
