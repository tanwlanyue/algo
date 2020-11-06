package leetcode;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class LC0594 {
    public int findLHS(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            map.put(num,map.getOrDefault(num,0)+1);
        }
        Iterator<Integer> iterator = map.keySet().iterator();
        int maxSize=0;
        while (iterator.hasNext()){
            Integer num = iterator.next();
            if(map.keySet().contains(num+1)){
                int plusSize=map.get(num)+ map.get(num+1);
                maxSize=Math.max(maxSize,plusSize);
            }
        }
        return maxSize;
    }
}
