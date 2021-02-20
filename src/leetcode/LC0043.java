package leetcode;

public class LC0043 {

    public String multiply(String num1, String num2) {
        if ("0".equals(num1) || "0".equals(num2)) {
            return "0";
        }
        int len1 = num1.length();
        int len2 = num2.length();
        int[] number = new int[len1 + len2];
        for (int i = len1-1; i >=0; i--) {
            for (int j = len2-1; j >=0 ; j--) {
                int p1=i+j;
                int p2=i+j+1;
                int sum=(num1.charAt(i)-'0')*(num2.charAt(j)-'0')+ number[p2];
                number[p2]=sum%10;
                number[p1]+=sum/10;
            }
        }
        StringBuilder builder = new StringBuilder();
        if(number[0]!=0){
            builder.append(number[0]);
        }
        for (int i = 1; i < number.length; i++) {
            builder.append(number[i]);
        }
        return builder.toString();
    }

//    public String multiply(String num1, String num2) {
//        int len1 = num1.length();
//        int len2 = num2.length();
//        int[] tmp = new int[len1 + len2];
//        for (int i = len1-1; i >=0; i--) {
//            for (int j = len2-1; j >= 0; j--) {
//
//                int p1=i+j;
//                int p2=i+j+1;
//                int sum=(num1.charAt(i)-'0')*(num2.charAt(j)-'0')+tmp[p2];
//                tmp[p1]+=sum/10;
//                tmp[p2]=sum%10;
//            }
//        }
//        int i=0;
//        while (i<tmp.length&&tmp[i]==0){
//            i++;
//        }
//        StringBuilder builder = new StringBuilder();
//        for (; i <tmp.length; i++) {
//            builder.append(tmp[i]);
//        }
//        return builder.toString();
//    }

    public static void main(String[] args) {
        new LC0043().multiply("2", "3");
    }
}
