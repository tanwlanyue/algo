package offer;

public class OF17 {

    public int[] printNumbers(int n) {
        int limit=1;
        for (int i = 0; i < n; i++) {
            limit*=10;
        }
        int[] ints = new int[limit - 1];
        for (int i = 0; i < ints.length; i++) {
            ints[i]=i+1;
        }
        return ints;
    }
}
