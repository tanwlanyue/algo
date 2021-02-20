package leetcode;

public class LC0007 {

    public int reverse(int x) {
        int ret=0;
        while (x!=0){
            int y=x%10;
            x=x/10;
            if(ret>Integer.MAX_VALUE/10||(ret==Integer.MAX_VALUE/10&&y>7)){return 0;}
            if(ret<Integer.MIN_VALUE/10||(ret==Integer.MIN_VALUE/10&&y<-8)){return 0;}
            ret=ret*10+y;
        }
        return ret;
    }
}
