package offer;

import java.util.ArrayList;

public class OF57_2 {

    public int[][] findContinuousSequence(int target) {
        ArrayList<int[]> lists = new ArrayList<>();
        for (int i = 1; i <=target/2; i++) {
            int len=2;
            int sum=0;
            while (sum<=target){
                sum=len*(2*i+len-1)/2;
                if(sum==target){
                    int[] ints = new int[len];
                    for (int j = i; j < i+len; j++) {
                        ints[j-i]=j;
                    }
                    lists.add(ints);
                }
                len++;
            }
        }
        int size = lists.size();
        int[][] ints = new int[size][];
        for (int i = 0; i < size; i++) {
            lists.get(i);
        }
        return ints;
    }
}
