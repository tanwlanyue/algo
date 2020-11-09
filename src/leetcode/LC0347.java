package leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class LC0347 {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num,map.getOrDefault(num,0)+1);
        }
        List<Integer>[] buckets = new ArrayList[nums.length + 1];
        for (int key : map.keySet()) {
            int frequency = map.get(key);
            if (buckets[frequency] == null) {
                buckets[frequency] = new ArrayList<>();
            }
            buckets[frequency].add(key);
        }
        int[] res = new int[k];
        int j=0;
        for (int i = buckets.length-1; i >=0; i--) {
            List<Integer> list = buckets[i];
            if(list!=null){
                for (Integer integer : list) {
                    res[j++]=integer;
                }
                if(j==k){
                    break;
                }
            }

        }
        return res;
    }
}
