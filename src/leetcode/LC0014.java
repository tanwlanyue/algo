package leetcode;

public class LC0014 {
    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0){
            return "";
        }
        String ans = strs[0];
        for (int i = 1; i < strs.length; i++) {
            int j = 0;
            int minLen=Math.min(ans.length(),strs[i].length());
            while (j < minLen && ans.charAt(j) == strs[i].charAt(j)) {
                j++;
            }
            ans = ans.substring(0, j);
            if (ans.length() == 0) {
                return ans;
            }
        }
        return ans;
    }
}
