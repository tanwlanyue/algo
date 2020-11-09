package leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class LC0451 {
    public String frequencySort(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (char c : s.toCharArray()) {
            map.put(c,map.getOrDefault(c,0)+1);
        }
        ArrayList<Character>[] buckets = new ArrayList[s.length()+1];
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            Integer count = entry.getValue();
            ArrayList<Character> list = buckets[count];
            if(list==null){
                list=new ArrayList<>();
                buckets[count]=list;
            }
            list.add(entry.getKey());
        }

        StringBuilder builder = new StringBuilder();
        for (int i = buckets.length-1; i >=0; i--) {
            ArrayList<Character> list = buckets[i];
            if(list!=null){
                for (Character c : list) {
                    for (int j = 0; j < i; j++) {
                        builder.append(c);
                    }
                }
            }
        }
        return builder.toString();
    }
}
