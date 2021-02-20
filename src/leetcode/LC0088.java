package leetcode;

public class LC0088 {

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i=m-1,j=n-1,k=m+n-1;
        while (i>=0&&j>=0){
            int i1 = nums1[i];
            int i2 = nums2[j];
            if(i1>=i2){
                nums1[k--]=i1;
                i--;
            }else {
                nums1[k--]=i2;
                j--;
            }
        }
        if(i==-1){
            for (int l = j; l >=0 ; l--) {
                nums1[k--]=nums2[l];
            }
        }

        if(j==-1){
            for (int l = i; l >=0 ; l--) {
                nums1[k--]=nums1[l];
            }
        }
    }
}
