package leetcode;

public class LC0409 {

    public int longestPalindrome(String s) {
        int[] sc = new int[128];
        for (char c : s.toCharArray()) {
            sc[c]++;
        }
        int len=0;
        for (int i : sc) {
            len+=(i/2)*2;
        }
        if(len<s.length()){
            len++;
        }
        return len;
    }
}
