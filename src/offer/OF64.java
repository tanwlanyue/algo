package offer;

/**
 * 100.00%
 * 44.43%
 */
public class OF64 {

    public int sumNums(int n) {
        if(n==1){
            return 1;
        }
        return n+sumNums(n-1);
    }
}
