package leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * FIXME
 */
public class LC0006 {

    public String convert(String s, int numRows) {
        if(numRows==1){
            return s;
        }
        int cut=numRows+numRows-2;
        char[] charArray = s.toCharArray();
        List<Character>[] bucket = new ArrayList[numRows];
        for (int i = 0; i < s.length(); i++) {
            int hash=i%cut;
            if(hash<numRows){

            }else {
                hash=cut-hash;
            }
            List<Character> arrayList = bucket[hash];
            if(arrayList==null){
                arrayList=new ArrayList<Character>();
                bucket[hash]=arrayList;
            }
            arrayList.add(charArray[i]);
        }
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < bucket.length; i++) {
            if(bucket[i]!=null){
                for (Character character : bucket[i]) {
                    builder.append(character);
                }
            }
        }
        return builder.toString();
    }

    public static void main(String[] args) {
        new LC0006().convert("A",2);
    }
}
