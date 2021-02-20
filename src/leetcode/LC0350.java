package leetcode;

import java.util.ArrayList;
import java.util.HashMap;

public class LC0350 {

    public int[] intersect(int[] nums1, int[] nums2) {
        ArrayList<Integer> list = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : nums1) {
            map.put(num,map.getOrDefault(num,0)+1);
        }
        for (int num : nums2) {
            Integer count = map.getOrDefault(num, 0);
            if(count>0){
                list.add(num);
                map.put(num,count-1);
            }
        }
        int[] ret = new int[list.size()];
        for (int i = 0; i < ret.length; i++) {
            ret[i]=list.get(i);
        }
        return ret;
    }
}
