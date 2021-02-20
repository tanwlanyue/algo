package offer;

public class OF46 {


//    public int translateNum(int num) {
//        String s = String.valueOf(num);
//        int[] dp = new int[s.length()];
//        dp[0]=1;
//        int length = s.length();
//        if(length==1){
//            return 1;
//        }
//        dp[1]=(canParse(s,0)?1:0)+dp[0];
//
//        for (int i = 2; i < length; i++) {
//            dp[i]=(canParse(s,i-1)?dp[i-2]:0)+dp[i-1];
//        }
//        return dp[length-1];
//    }
//
//    private boolean canParse(String s, int i) {
//        int parseInt = Integer.parseInt(s.substring(i, i + 2));
//        return parseInt>=10&&parseInt<=25;
//    }

}
