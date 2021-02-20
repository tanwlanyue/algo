package leetcode;

import java.util.HashSet;

public class LC0076 {

    public String minWindow(String s, String t) {
        int[] need = new int[128];
        int[] window = new int[128];
        HashSet<Character> needSet = new HashSet<>();
        for (char c : t.toCharArray()) {
            need[c]++;
            needSet.add(c);
        }
        int needCharNum = needSet.size();
        int length = s.length();
        int left=0,right=0,valid=0;
        int startIndex=0,len=Integer.MAX_VALUE;
        char[] array = s.toCharArray();
        while (right<length){
            char c = array[right++];
            if(need[c]>0){// 如果是需要的字符
                window[c]++;
                if(need[c]==window[c]){//这个字符时候已经满足
                    valid++;
                }
            }
            while (valid==needCharNum){
                if(right-left<len){
                    startIndex=left;
                    len=right-left;
                }
                c=array[left++];
                if(need[c]>0){
                    if(window[c]==need[c]){
                        valid--;
                    }
                    window[c]--;
                }
            }
        }
        return len==Integer.MAX_VALUE? "" : s.substring(startIndex,startIndex+len);
    }
}
