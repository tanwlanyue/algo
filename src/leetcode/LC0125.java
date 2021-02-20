package leetcode;

public class LC0125 {

    public boolean isPalindrome(String s) {
        char[] array = s.toLowerCase().toCharArray();
        int i=0,j=s.length()-1;
        while (i<j){
            char lc = array[i];
            char rc = array[j];
            if(!Character.isLetterOrDigit(lc)){
                i++;
                continue;
            }
            if(!Character.isLetterOrDigit(rc)){
                j--;
                continue;
            }
            if(lc==rc){
                i++;
                j--;
            }else {
                return false;
            }
        }
        return true;
    }
}
