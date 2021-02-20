package offer;

public class OF33 {
//    public boolean verifyPostorder(int[] postorder) {
//        return verifyPostorder(postorder,0,postorder.length-1);
//    }
//
//    public boolean verifyPostorder(int[] postorder,int i,int j) {
//        if(j-i<=1){
//            return true;
//        }
//        int rootVal=postorder[j];
//        //找左子树范围
//        int cutIndex=i;
//        while (cutIndex<j&&postorder[cutIndex]<rootVal){
//            cutIndex++;
//        }
//        for (int m = cutIndex; m < j; m++) {
//            if(postorder[m]<rootVal){
//                return false;
//            }
//        }
//        return verifyPostorder(postorder,i,cutIndex-1)&&verifyPostorder(postorder,cutIndex,j-1);
//    }

    public boolean verifyPostorder(int[] postorder) {
        return verifyPostorder(postorder,0,postorder.length-1);
    }

    private boolean verifyPostorder(int[] postorder, int l, int r) {
        if(l>=r){
            return true;
        }
        int rTreeRange=r;
        for (int i = l; i <r; i++) {
            if(postorder[i]>postorder[r]){
                rTreeRange=i;
                break;
            }
        }
        for (int i = rTreeRange; i < r; i++) {
            if(postorder[i]<postorder[r]){
                return false;
            }
        }
        return verifyPostorder(postorder,l,rTreeRange-1)&& verifyPostorder(postorder,rTreeRange,r-1);
    }
}
