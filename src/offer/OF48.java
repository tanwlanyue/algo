package offer;

/**
 * 100.00%
 * 88.30%
 */
public class OF48 {

    public int lengthOfLongestSubstring(String s) {
        int l=0,r=0;
        int length = s.length();
        int[] cTable = new int[128];
        int inValidCount=0;
        int maxLen=0;
        while (r<length){
            if(++cTable[s.charAt(r)]==2){
                inValidCount++;
            }
            r++;
            while (inValidCount!=0){
                if(--cTable[s.charAt(l)]==1){
                    inValidCount--;
                }
                l++;
            }
            maxLen=Math.max(maxLen,r-l);
        }
        return maxLen;
    }
}
