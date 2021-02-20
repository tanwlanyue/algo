package leetcode;

public class LC0003 {

    public int lengthOfLongestSubstring(String s) {
        int length = s.length();
        int l=0,r=0;
        int[] chars = new int[128];
        int maxLen=0;
        int invalidCount=0;
        while (r<length){
            int rIndex=s.charAt(r);
            if(chars[rIndex]==1){
                invalidCount++;
            }
            chars[rIndex]++;
            r++;
            while (invalidCount!=0){
                int lIndex=s.charAt(l);
                if(--chars[lIndex]==1){
                    invalidCount--;
                }
                l++;
            }
            int len=r-l;
            maxLen=Math.max(len,maxLen);
        }
        return maxLen;
    }
}
