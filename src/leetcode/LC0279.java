package leetcode;

/**
 *  任何一个正整数都可以表示成不超过四个整数的平方之和。 推论：满足四数平方和定理的数n（四个整数的情况），必定满足 n=4^a(8b+7)
 */
public class LC0279 {

    private boolean isSquare(int n) {
        int sq = (int) Math.sqrt(n);
        return n == sq * sq;
    }

    public int numSquares(int n) {
        // four-square and three-square theorems.
        while (n % 4 == 0){
            n /= 4;
        }
        if (n % 8 == 7){
            return 4;
        }
        if (isSquare(n)){
            return 1;
        }
        // enumeration to check if the number can be decomposed into sum of two squares.
        for (int i = 1; i * i <= n; ++i) {
            if (isSquare(n - i * i)){
                return 2;
            }
        }
        // bottom case of three-square theorem.
        return 3;
    }
}
