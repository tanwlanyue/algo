package leetcode;

public class LC0424 {
    public int characterReplacement(String s, int k) {
        int length = s.length();
        int left = 0,right = 0;
        int historyMaxCount = 0;
        int[] countArray = new int[26];
        while (right < length) {
            historyMaxCount = Math.max(historyMaxCount, ++ countArray[s.charAt(right ++) - 'A']);
            while (right - left > historyMaxCount + k) {
                countArray[s.charAt(left ++) - 'A']--;
            }
        }
        return right - left;
    }
}
