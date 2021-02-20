package leetcode;

public class LC0205 {

    public boolean isIsomorphic(String s, String t) {
        int[] indexS = new int[128];
        int[] indexT = new int[128];
        for (int i = 0; i < s.length(); i++) {
            char sc = s.charAt(i), tc = t.charAt(i);
            if (indexS[sc] != indexT[tc]) {
                return false;
            }
            indexS[sc] = i+1;
            indexT[tc] = i+1;
        }
        return true;
    }
}
