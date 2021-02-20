package offer;

public class OF66 {

    public int[] constructArr(int[] a) {
        int[] ints = new int[a.length];
        int p=1,q=1;
        for (int i = 0; i < a.length; i++) {
            ints[i]=p;
            p*=a[i];
        }
        for (int i = a.length-1; i >=1 ; i--) {
            q*=a[i];
            ints[i-1]*=q;
        }
        return ints;
    }
}
