package leetcode;

public class LC0242 {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        int[] sc = new int[26];
        for (char c : s.toCharArray()) {
            sc[c-'a']++;
        }
        for (char c : t.toCharArray()) {
            sc[c-'a']--;
        }
        for (int i : sc) {
            if(i!=0){
                return false;
            }
        }
        return true;
    }
}
