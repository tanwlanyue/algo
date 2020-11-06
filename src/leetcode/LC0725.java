package leetcode;

import util.ListNode;

import java.util.Arrays;

public class LC0725 {
    public ListNode[] splitListToParts(ListNode root, int k) {
        ListNode countNode=root;
        int size=0;
        while (countNode!=null){
            countNode=countNode.next;
            size++;
        }
        int pArray=size%k;
        int[] sizeArray = new int[k];
        Arrays.fill(sizeArray,size/k);
        for (int i = 0; i < pArray; i++) {
            sizeArray[i]+=1;
        }
        ListNode[] listNodes = new ListNode[k];
        for (int i = 0; i < k-1; i++) {
            listNodes[i]=root;
            for (int j = 0; j < sizeArray[i]-1; j++) {
                root=root.next;
            }
            if(root!=null){
                ListNode next=root.next;
                root.next=null;
                root=next;
            }
        }
        listNodes[k-1]=root.next;
        return listNodes;
    }
}
