package leetcode;

/**
 * FIXME
 * KMP BM BF
 */
public class LC0028 {

    public int strStr(String haystack, String needle) {
        if("".equals(needle)){
            return 0;
        }
        int lenH = haystack.length();
        int lenN = needle.length();
        if(lenN>lenH){
            return -1;
        }
        for (int i = 0; i <= lenH - lenN; i++) {
            int a=i, b=0;
            while (b<lenN){
                if (haystack.charAt(a)==needle.charAt(b)) {
                    a++;
                    b++;
                }else {
                    break;
                }
            }
            if(b==lenN){
                return i;
            }
        }
        return -1;
    }
}
