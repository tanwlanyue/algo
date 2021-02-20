package leetcode;

import java.util.HashMap;
import java.util.Map;

public class LC0697 {

    class Node{
        int num;
        int left;
        int right=left;
        int count=1;

        public Node(int num, int left, int right, int count) {
            this.num = num;
            this.left = left;
            this.right = right;
            this.count = count;
        }
    }

    public int findShortestSubArray(int[] nums) {
        HashMap<Integer, Node> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            Node node = map.get(num);
            if(node==null){
                node=new Node(num,i,i,1);
                map.put(num,node);
            }else {
                node.right=i;
                node.count++;
            }
        }
        int max=0;
        int minLen=nums.length;
        for (Map.Entry<Integer, Node> entry : map.entrySet()) {
            Node node = entry.getValue();
            if(node.count>max){
                max=node.count;
                minLen=nums.length;
                minLen=Math.min(minLen,node.right-node.left+1);
            }else if(node.count==max){
                minLen=Math.min(minLen,node.right-node.left+1);
            }

        }
        return minLen;
    }

    public static void main(String[] args) {
        System.out.println(new LC0697().findShortestSubArray(new int[]{1, 2, 2, 3, 1}));
    }
}
