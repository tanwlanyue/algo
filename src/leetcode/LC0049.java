package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/**
 * 95.52%
 * 50.43%
 */
public class LC0049 {

    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();
        for (int i = 0; i < strs.length; i++) {
            char[] array = strs[i].toCharArray();
            Arrays.sort(array);
            String key = new String(array);
            List<String> list = map.get(key);
            if(list==null){
                list=new ArrayList<>();
                map.put(key,list);
            }
            list.add(strs[i]);
        }
        return new ArrayList<>(map.values());
    }
}
