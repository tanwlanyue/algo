package leetcode;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class LC0128 {
    public int longestConsecutive(int[] nums) {
        Map<Integer, Integer> countForNum = new HashMap<>();
        for (int num : nums) {
            countForNum.put(num,1);
        }
        for (int num : nums) {
            forward(countForNum,num);
        }
        Iterator<Integer> iterator = countForNum.values().iterator();
        int res=0;
        while (iterator.hasNext()) {
            res=Math.max(iterator.next(),res);
        }
        return res;
    }

    private int forward(Map<Integer, Integer> countForNum, int num) {
        if(!countForNum.containsKey(num)){
            return 0;
        }
        int cnt = countForNum.get(num);
        if(cnt>1){
            return cnt;
        }
        cnt=forward(countForNum,num+1)+1;
        countForNum.put(num,cnt);
        return cnt;
    }
}
