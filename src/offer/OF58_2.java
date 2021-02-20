package offer;

public class OF58_2 {

    public String reverseLeftWords(String s, int n) {
        int length = s.length();
        n = n % length;
        int l=0,r=n-1;
        char[] array = s.toCharArray();
        while (l<r){
            swap(array,l++,r--);
        }
        l=n;
        r=length-1;
        while (l<r){
            swap(array,l++,r--);
        }
        l=0;
        r=length-1;
        while (l<r){
            swap(array,l++,r--);
        }
        return new String(array);
    }

    private void swap(char[] array, int l, int r) {
        char tmp=array[l];
        array[l]=array[r];
        array[r]=tmp;
    }
}
