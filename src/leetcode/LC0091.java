package leetcode;

public class LC0091 {

    public int numDecodings(String s) {
        int length = s.length();
        int[] dp = new int[s.length()];//字符的长度
        dp[0]=canParse(s.charAt(0))?1:0;
        if(s.length()==1){
            return dp[0];
        }
        dp[1]=(canParse(s,0)?1:0)+(canParse(s.charAt(1))?dp[0]:0);
        for (int i = 2; i < length; i++) {
            dp[i]=(canParse(s,i-1)?dp[i-2]:0)+(canParse(s.charAt(i))?dp[i-1]:0);
        }
        return dp[length-1];
    }

    public boolean canParse(String s,int begin){
        int i=begin;
        int j=begin+1;
        int firstNum=s.charAt(i)- '0';
        int secondNum=s.charAt(j)- '0';
        if(firstNum==1){
            return true;
        }else if(firstNum==2){
            if(secondNum<=6){
                return true;
            }
        }
        return false;
    }

    public boolean canParse(char c){
        return c-'0'!=0;
    }
}
