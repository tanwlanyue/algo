package offer;

public class OF58_1 {

    public String reverseWords(String s) {
        String[] s1 = s.split(" ");
        StringBuilder builder = new StringBuilder();
        for (int i = s1.length-1; i >=0; i--) {
            if(s1[i].equals("")) continue;
            builder.append(s1[i]+" ");
        }
        return builder.toString().trim();
    }
}
