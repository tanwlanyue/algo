package leetcode;

public class LC0032 {

//    public int longestValidParentheses(String s) {
//        int max=0;
//        LinkedList<Integer> stack = new LinkedList<>();
//        stack.push(-1);
//        char[] array = s.toCharArray();
//        for (int i = 0; i < array.length; i++) {
//            if('('==array[i]){
//                stack.push(i);
//            }else {
//                stack.pop();
//                if(stack.isEmpty()){
//                    stack.push(i);
//                }else {
//                    max=Math.max(i-stack.peek(),max);
//                }
//            }
//        }
//        return max;
//    }


    public int longestValidParentheses(String s) {
        int length = s.length();
        int[] dp = new int[length];  //已i结尾的最长括号
        char[] array = s.toCharArray();
        int max=0;
        for (int i = 0; i < array.length; i++) {
            if('('==array[i]){
                dp[i]=0;
            }else {
                if(array[i-1]=='('){
                    dp[i]=((i>=2)?dp[i-2]:0)+2;
                }else {
                    int index=i-1-dp[i-1];
                    if(index>=0&&array[index]=='('){
                        dp[i]=dp[i-1]+((index-1>=0)?dp[index-1]:0)+2;
                    }else {
                        dp[i]=0;
                    }
                }
            }
            max = Math.max(max, dp[i]);
        }
        return max;
    }
}
