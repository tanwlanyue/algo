package leetcode;

import java.util.HashSet;

public class LC0202 {

    public boolean isHappy(int n) {
        HashSet<Integer> set = new HashSet<>();
        while (n!=1&&!set.contains(n)){
            set.add(n);
            int totalSum = 0;
            while (n!=0){
                int d=n%10;
                totalSum+=d*d;
                n=n/10;
            }
            n=totalSum;
        }
        return n==1;
    }
}
