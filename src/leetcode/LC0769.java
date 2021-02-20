package leetcode;

import java.util.HashSet;

public class LC0769 {

    public int maxChunksToSorted(int[] arr) {
        HashSet<Integer> visited = new HashSet<>();
        int curSearch=0;
        int count=0;
        for (int i = 0; i < arr.length; i++) {
            if(visited.contains(arr[i])){
                continue;
            }
            if(curSearch==arr[i]){
                count++;
                while (true){
                    if (!visited.contains(++curSearch)) break;
                }
            }
            visited.add(arr[i]);
        }
        return count;
    }
}
