package leetcode;


/**
 * 中心扩展 Manacher 动态规划
 */
public class LC0005 {

    public String longestPalindrome(String s) {
        int maxLen=0;
        String ret="";
        int length = s.length();
        for (int i = 0; i < length; i++) {
            String oddStr = getStr(s, i, i);
            String evenStr = getStr(s, i, i + 1);
            String maxLenStr = oddStr.length() > evenStr.length() ? oddStr : evenStr;
            if (maxLenStr.length() > maxLen) {
                maxLen = maxLenStr.length();
                ret = maxLenStr;
            }
        }
        return ret;
    }

    private String getStr(String s, int left, int right) {
        int count=0;
        while (left>=0&&right<s.length()){
            if(s.charAt(left)==s.charAt(right)){
                left--;
                right++;
            }else {
                break;
            }
        }
        return s.substring(left+1,right);
    }
}
